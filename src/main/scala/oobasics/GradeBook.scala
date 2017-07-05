package oobasics

/**
  * Created by bibikhadiza on 7/3/17.
  */
object GradeBook {
  def main(args: Array[String]): Unit = {

    val students = List(new Students("Jane", "Doe"), new Students("John", "Doe"))
    for(s <- students) printStudent(s)
  }

  def printStudent(s: Students): Unit = {
    println(s.firstName + " " + s.lastName)
    println("Grade =" + s.average)
    println("Tests = " + s.tests.mkString(", "))
  }


  //In Scala as long as a method is not recursive you can leave off the method type
  /*You only leave it off when its obvious what the return type is*/

}

//the main method allows an object to be run as an application
//Object are singletons , you only put main inside of an object
// Objects exists on their own and classes need to be instantiated
//classes are blueprints used for polymorphism
//in object declaration we basically create an object and what does into of an object
// with classes you are given a blueprint of what should go inside of an object but you do not have the object until you instantiate it

