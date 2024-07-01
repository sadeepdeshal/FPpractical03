package FP_Prac03

import scala.io.StdIn._

object Q4 {
  var numbersList = List[Int]()
  var sumOfEvenNumbers = 0

  def main(args: Array[String]): Unit = {
    populateAndSumEvenNumbers()
    println("List of numbers - " + numbersList)
    println("Sum of even numbers - " + sumOfEvenNumbers)
  }

  def populateAndSumEvenNumbers(): Unit = {
    println("Enter number of integers that you want to add:")
    val num = readInt()

    sumOfEvenNumbers = 0

    for (i <- 1 to num) {
      println("Enter integer "+i+" : ")
      val getNumber = readInt()
      numbersList = numbersList :+ getNumber
      if (getNumber % 2 == 0) {
        sumOfEvenNumbers += getNumber
      }
    }
  }
}
