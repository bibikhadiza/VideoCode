package basics

import scala.io.Source
// source is a class or object used to read text data from a file
import scala.io.StdIn._
import java.io.PrintWriter



/* import the scala io library. Import statements
* This import function is importing all the methods from the scala io library.
* imports can also be scoped
* */

object Libraries {

  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("matrix.txt") // returns an iterator. iterators are consumed while used
    val lines = source.getLines()
    val matrix = lines.map(_.split(" ").map(_.toDouble)).toArray
    source.close()

    var pw = new PrintWriter("rowSums.txt")
    matrix.foreach {row => pw.println(row.sum)}
    pw.close()

    println("What is your name")
    val name = readLine()
    println("How old are you?")
    val age = readInt()
    val lst = buildList()
    println(lst)
    println(concatStrings(lst))
    val Array(a, b, c) = "one two three".split(" ")
    grade(assignments = List(45, 98), quizzes = List(45, 89))

  }
    /*SCALA ARRAYS AND LISTS*/

    /*They are both created almost equally
  * The difference is that one is immutable and one if mutable
  * array is mutable and the list is not
  * val cannot be changed
  * val arr = Array(7, 5, 70, 89, 23)
  * arr(2) = 99 // will change the array to (7, 5, 99, 89, 23)
  * But I cannot reassign the array
  * arr = Array(1, 2, 3) => will lead to error.
  * Lists are not mutable. You cannot update the values within a list
  * However with arrays you cannot change the size of an array. You can copy over values to another array but cannot change the size
  * With lists however you can append and prepend elements within the list. this however will create a new list. Its more effecient then creating a array with copy
  * list.toArray => convert list to array
  * array.toList => converts array to list
  * */

  /*Fill and Tabulate*/

  /* array and lists cannot create large collections and are not ideal for these practices
  fill is a curried method
  * */

  /*RANGE*/
  /* Range provides and range of value from the defined value to the parameter passed to the to function
  for example 1 to 10 is equavlent to 1.to(10)
  this will bring a range of integers within the range on 1 and 10
  you can also set conditions to your ranges
  1 to 10 by 2 is equalivalent to the executable 1.to(10).by(2)
  However although both characters and integers are able to provide ranges
  a type Double cannot provide a range unless appended with the by function
  this is due to the fact that Doubles can be ranged by any double integer itself.
  10.0.to(20.0).by(0.1)
  
  *all array and list objects are immutable
  * */

  /*Higher order Sequence Methods
  * When a function takes a function as an argument or returns a function, it's called a higher order function
  * examples of higher order methods are map partician find exist foreach count and filter. They all take in a lamda method and return a return
  * value from the method.
  * functions that return a boolean is called a predicate
  * */


  /* Strings as sequences
  in scalal a string can be thought of as a sequence of characters
  Strings are collections in scala
  * */

  /* Lists, Recursion and Patterns
  *
  * */

    def buildList(): List[String] = {
      val input = readLine()
      if(input == "quit") Nil else input :: buildList()
    }

    def concatStrings(words: List[String]): String = {
      if (words.isEmpty ) ""
      else (words.head + concatStrings(words.tail))
    }

  def concatStringsPat(words: List[String]): String = words match {
    case nil => ""
    case h :: t => h + concatStringsPat(t)
  }

  /* the _ is scala represents a lamda expression
  a.map(i => i * 2) is equvalent to a.map(_ * 2)
  * */

  /* OPTIONS
  * in a typed language such as scala since code may or may not have a value
   * the proper way to handle this is to use a option
   * the reason for this is so that the language can help you enforce that the function may not have a value
   * the typed languages will force you to consider this
   * res0.get returns the value of the option but you should not use the get method all the time because if you use it on none you get an error
   * a way to retrieve value and still get no errors is to use patterns
  * you can also use getOrElse
  * res1.getOrElse(0)
  * */

  /*Named and default arguments
  * Much like in many other programming languages, In scala we can pass default arguments and arguments that
  * can be assigned to nil after specifying a argument type. You can overwrite the return type in method declaration
  * and any function whose return value is equal to a type of nil does not have to be provided on function execution
  * */

  def grade(quizzes: List[Int], assignments: List[Int], tests: List[Int] = Nil): Double = {
  }





}