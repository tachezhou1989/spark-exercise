package tachezhou.exercise.scalaBasic.eighth

/**
 * Created by Administrator on 2015/8/9 0009.
 */
abstract class Shape {
  def centerPoint
}

class Rectangle(a: Int, b: Int, c: Int) extends Shape {
  override def centerPoint: Unit = {

  }
}

class Circle(r: Double) extends Shape {
  override def centerPoint: Unit = {

  }
}