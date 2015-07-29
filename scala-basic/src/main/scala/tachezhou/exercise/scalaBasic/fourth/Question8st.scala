package tachezhou.exercise.scalaBasic.fourth

/**
 * Created by Administrator on 2015/7/26 0026.
 */
object Question8st {

  def minMax(values: Array[Int]): (Int,Int) = {
    (values.min,values.max)
  }

  def main(args: Array[String]): Unit = {
    val array = Array(1,3,5,7,8)
    println(minMax(array))
  }
}
