package tachezhou.exercise.scalaBasic.eighth

/**
 * Created by Administrator on 2015/8/9 0009.
 */
class Point(x: Int, y: Int) {

}

class LabelPoint(Label: String, x: Int, y: Int) extends Point(x, y) {
  def printLabel(): Unit = {
    println("the label is " + Label)
  }
}

object LabelPoint {
  def main(args: Array[String]) {
    val labelPoint = new LabelPoint("tag", 3, 4)
    labelPoint.printLabel()
  }
}