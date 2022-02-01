package org.apache.spark.sql.catalyst.plans

import java.util.Locale

object JoinType {
  def apply(typ: String): JoinType =
    typ.toLowerCase(Locale.ROOT).replace("_", "") match {
      case "inner"                        => Inner
      case "outer" | "full" | "fullouter" => FullOuter
      case "leftouter" | "left"           => LeftOuter
      case "rightouter" | "right"         => RightOuter
      case "leftsemi" | "semi"            => LeftSemi
      case "leftanti" | "anti"            => LeftAnti
      case "cross"                        => Cross
      case "pit"                          => PITJoin
      case _ =>
        val supported = Seq(
          "inner",
          "outer",
          "full",
          "fullouter",
          "full_outer",
          "leftouter",
          "left",
          "left_outer",
          "rightouter",
          "right",
          "right_outer",
          "leftsemi",
          "left_semi",
          "semi",
          "leftanti",
          "left_anti",
          "anti",
          "cross",
          "pit"
        )

        throw new IllegalArgumentException(
          s"Unsupported join type '$typ'. " +
            "Supported join types include: " + supported.mkString(
              "'",
              "', '",
              "'"
            ) + "."
        )
    }
}

sealed abstract class JoinType {
  def sql: String
}

case object PITJoin extends JoinType {
  override def sql: String = "PIT JOIN"
}
