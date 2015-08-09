package tachezhou.exercise.scalaBasic.eighth

/**
 * Created by Administrator on 2015/8/9 0009.
 */
class Square(point: Point, width: Int) extends java.awt.Rectangle {
  def this(width:Int) {
    this(new Point(0,0),width)
  }

  def this() {
    this(new Point(0,0),0)
  }
}
