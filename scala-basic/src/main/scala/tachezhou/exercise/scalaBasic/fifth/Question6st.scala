package tachezhou.exercise.scalaBasic.fifth

/**
 * Created by Administrator on 2015/7/29 0029.
 */
class Person(var age: Int) {
  if(age < 0) age = 0
  println("the age is " + age)
}

object Person {
  def main(args: Array[String]): Unit = {
    val person = new Person(-3)
  }
}
