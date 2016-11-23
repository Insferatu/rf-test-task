package com.henry.review.model

import org.apache.spark.sql.Row

case class Review(id: String,
                  productId: String,
                  userId: String,
                  profileName: String,
                  helpfulnessNumerator: String,
                  helpfulnessDenominator: String,
                  score: String,
                  time: String,
                  summary: String,
                  text: String)

object Review {
  def apply(row: Row): Review = {
    Review.apply(
      id = row.getString(0),
      productId = row.getString(1),
      userId = row.getString(2),
      profileName = row.getString(3),
      helpfulnessNumerator = row.getString(4),
      helpfulnessDenominator = row.getString(5),
      score = row.getString(6),
      time = row.getString(7),
      summary = row.getString(8),
      text = row.getString(9)
    )
  }
}
