package tachezhou.exercise.scalaBasic.sixth

/**
 * Created by Administrator on 2015/8/1 0001.
 */
class Pointer(val x: Int,val y: Int) {

}

object Pointer {
  def apply(x: Int,y: Int) =
    new Pointer(x,y)
}

object TestPointer {
  def main(args: Array[String]): Unit = {
    Pointer(2,3)
  }
}