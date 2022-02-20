import argparse
import re
from argparse import ArgumentParser
from enum import Enum
from typing import TypedDict
import sys

VERSION_FILE_NAME = "scala/VERSION"


class VersionDict(TypedDict):
    major: int
    minor: int
    patch: int


class BumpType(Enum):
    MAJOR = "major"
    MINOR = "minor"
    PATCH = "patch"

    def __str__(self) -> str:
        return self.value


VERSION_REGEX = r"^(?P<major>0|[1-9]\d*)\.(?P<minor>0|[1-9]\d*)\.(?P<patch>0|[1-9]\d*)$"


def validate_version(s: str) -> VersionDict:
    try:
        match = re.match(VERSION_REGEX, s)
        if match is None:
            raise Exception
        group_dict = match.groupdict()
        return {
            "major": int(group_dict["major"]),
            "minor": int(group_dict["minor"]),
            "patch": int(group_dict["patch"]),
        }
    except:
        msg = "not a valid version: {}".format(s)
        raise argparse.ArgumentTypeError(msg)


if __name__ == "__main__":
    argument_parser = ArgumentParser(description="Bump version")

    argument_parser.add_argument(
        "--bump-type",
        "-t",
        type=BumpType,
        choices=list(BumpType),
        required=True,
        help="Type of bump",
    )

    args = argument_parser.parse_args()

    # Get the old version
    version_file = open(VERSION_FILE_NAME, "r+")
    version: VersionDict = validate_version(version_file.readline())
    bump_type: BumpType = args.bump_type

    if bump_type is BumpType.MAJOR:
        version["major"] += 1
        version["minor"] = 0
        version["patch"] = 0
    elif bump_type is BumpType.MINOR:
        version["minor"] += 1
        version["patch"] = 0
    elif bump_type is BumpType.PATCH:
        version["patch"] += 1

    new_version_string = "{}.{}.{}".format(*version.values())

    # Check if the new version is valid
    validate_version(new_version_string)

    # Overwrite the file with new version
    version_file.seek(0)
    version_file.write(new_version_string)
    version_file.truncate()
