object HelloWorld {

  val name:String =  "Pat cook"
  val value: Int = 42
  var age = 22
  println(age += 1)

  //Difference between val and var
  // Beacause age is var declaration it can be reassigned to point to a different object
  //val is a final declaration. It cannot be changed. Immutable
  //val will always point to one object and will always point to the same object

  //val is prefered because it simplies the logic. Its easier to think about in programs

  //types: String, Int, Double, Char, Boolean, Unit(type that doesnt represent any information)

  val t = (1, 2.7, "hi there")
  val (a, b, c) = t
  println(t._1)

  val message = name + " is " + age + "years old."
  val message2 = s"$name is $age years old."
  val str = s"The second element of t is ${t._2}. "
  println(str)

  //with string interpolation in Scala higher order string manipulation will require the usage of curly braces


  def main(args: Array[String]): Unit = {
    println("Hello World")
  }

  /*This file created for Object0orientation, abstraction, and data structures using scala*/

  value.+(age) == value + age

  /* expression are literals that can be combiened with operators to execute value
   in scala the symbols are not built into the landguage its implimented in a library
  * in scala symbols have higher precidence then characters
  * */

  name == "Pat cook" * 5

  /* Lamda expressions/ closures
  * it is a short literal expression that defines a function
  * val square = (x: Double) =>  x * x
  * short literal expressio nthat defines a function/ should not be overly long. simple as possible
  * used for expression or functions that are not used oftern therefor not in need of a method
  * val square: Double => Double = x => x * x
  * val square = (x:Double) = > x * x
  * val twice: Double => Double = x => _ * 2
  * */








}


