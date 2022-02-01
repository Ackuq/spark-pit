package org.apache.spark.sql.catalyst.plans

import java.util.Locale
import org.apache.spark.sql.catalyst.expressions.Attribute

//adapted from Simba: https://github.com/InitialDLab/Simba

object AsOfJoinType {
  def apply(typ: String): AsOfJoinType =
    typ.toLowerCase.replace("_", "") match {
      case "pit" => PITJoin
      case _ =>
        val supported = Seq("knn")

        throw new IllegalArgumentException(
          s"Unsupported spatial join type '$typ'. " +
            "Supported spatial join types include: " + supported.mkString(
              "'",
              "', '",
              "'"
            ) + "."
        )
    }
}

sealed abstract class AsOfJoinType

case object PITJoin extends AsOfJoinType
