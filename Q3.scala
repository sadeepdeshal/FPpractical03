package FP_Prac03

import scala.math.BigDecimal

object Q3 {

  def main(args:Array[String]):Unit= {
    val num1=5
    val num2=4

    val avg = average1(num1, num2)
    println("average of that two number is : " + avg)

  }

  def average1(num1: Int, num2: Int): Double = {
    val avg = (num1 + num2) / 2.0
    val roundedAvg = BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    roundedAvg
  }
}
