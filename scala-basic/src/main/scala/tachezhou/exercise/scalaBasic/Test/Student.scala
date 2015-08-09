package tachezhou.exercise.scalaBasic.Test

/**
 * Created by Administrator on 2015/7/30 0030.
 */
class Student {

}

object Student {

  def apply(name: String) = {
    println("my name is " + name)
  }

  def main(args: Array[String]): Unit = {
    Student("tachezhou")
  }
}
