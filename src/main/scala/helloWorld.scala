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



  var i = 0  //in while loops you should use the var eyework beacaucse var is mutable

  while (i < 10){
    println(i)
    i += 1
  }

  /*In if else conditions if the true and false values within the condition are not the same type, the return value of the function is a type any */

  // for loops / comprehensions

  val stuff = for {
    i <- 0 until 10
    if i%3 == 0 || i%5 == 0
    sqr = i * i
    j <- 'a' to 'c'
  } yield
   {
    i -> j
  }

  println(stuff)

  //for loops in scala consists of a generator, conditionals

  /* Scala match is powerful because it gives you the availability to do pattern matching
  With matches the first parameter of the match is the truthy conditions
  and match function then takes in a block parametere that checks to determine
  if any cases match. We do this by calling a case function and passing alone the projected outcome
  if and the value is truth then we use a lamda expression to give a return value
  else we have a fine case statment that takes in anything and returns it to a string in my case.
  * */

  var fizzbuzz = for(i <- 1 to 20) yield {
    (i%3, i%5) match {
      case (0, 0) if i < 5=> "fizzbuzz"
      case (0, _) => "fizz"
      case (_, 0) => "buzz"
      case _ => i.toString
    }
  }

  /* Catch / try is used to catch errors
  in a catch method you want to be able to catch any errors what might be thrown when your equation is not executable.
  When creating a try expression we block out our operation within a try function.
  the catch function takes the try function and evaluates if the equation returns an error
  when the error is caught by applying the catch function, we can now create
  cases in which we explicitly assign the return value for any exception. We use the rocket operator which is a lamda operator.
  In catches we have to set cases for all error catches in order to make sure all error expections are caught.
  * */

  var stri = "123a"
  val num = try {
    stri.toInt
  } catch {
    case ex: NumberFormatException => 0

  }
  println(num)










}


