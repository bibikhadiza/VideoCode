package basics
import scala.io.StdIn._

/* import the scala io library. Import statements
* This import function is importing all the methods from the scala io library.
* imports can also be scoped
* */

object Libraries {

  def main(args: Array[String]): Unit = {
    println("What is your name")
    val name = readLine()
    println("How old are you?")
    val age = readInt()


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
  
  *
  *
  *
  *
  *
  * */


  }
}