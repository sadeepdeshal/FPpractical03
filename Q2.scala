package FP_Prac03

import scala.io.StdIn._

object Q2 {
  var initiallist = List[String]()
  var finallist = List[String]()

  def main(args:Array[String]):Unit= {
    stringasalist()
    println("Initial list - " + initiallist)
    println("Final list - " + finallist)
  }

  def stringasalist(): Unit = {
    println("Enter number of strings that you want to add:")
    val num = readInt()

    for (i <- 1 to num) {
      println("Enter string "+i+" : ")
      val getstring = readLine()
      initiallist = initiallist :+ getstring
      if (getstring.length > 5) {
        finallist = finallist :+ getstring
      }
    }
  }
}
