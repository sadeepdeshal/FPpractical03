package FP_Prac03

import scala.io.StdIn.readLine

object Q1 {
  def main(args:Array[String]):Unit= {
    println("Enter some text : ")
    var getinput = readLine()

    val reversedStr = reverseString(getinput)
    println(reversedStr)
  }

  def reverseString(s: String): String = {
    if (s.isEmpty) ""
    else reverseString(s.tail) + s.head
  }

}
