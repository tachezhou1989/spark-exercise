package tachezhou.exercise.scalaBasic.Test

/**
 * Created by Administrator on 2015/7/30 0030.
 */
//伴生类和非伴生类互相访问私有对象
class Person {
  private var age:Int = 3
  def printlnObjectPri(): Unit = {
    println(Person.name)
  }
}

object Person {
  private var name:String = "tachezhou"

  def printClassPri(): Unit = {
    println(new Person().age)
  }
}