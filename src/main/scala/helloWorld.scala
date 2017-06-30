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

  def main(args: Array[String]): Unit = {
    println("Hello World")
  }

  /*This file created for Object0orientation, abstraction, and data structures using scala*/
}


