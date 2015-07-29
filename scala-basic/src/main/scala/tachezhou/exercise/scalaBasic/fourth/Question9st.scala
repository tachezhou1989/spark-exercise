package tachezhou.exercise.scalaBasic.fourth

/**
 * Created by Administrator on 2015/7/26 0026.
 */
object Question9st {

  def lteqgt(values: Array[Int],v: Int): (Int,Int,Int) = {
    (values.filter(_ < v).length,values.filter(_ == v).length,values.filter(_ > v).length)
  }

  def main(args: Array[String]): Unit = {
    val array = Array(1,3,5,7,8)
    println(lteqgt(array,3))
  }
}
