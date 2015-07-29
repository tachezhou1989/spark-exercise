package tachezhou.exercise.scalaBasic.fourth

/**
 * Created by Administrator on 2015/7/23 0023.
 */
object Question1st {
  def discount(toolsMap: scala.collection.mutable.HashMap[String, Double], discount: Double) = {
    toolsMap.foreach(keyValue => {
      toolsMap(keyValue._1) = keyValue._2 * discount
    })
  }

  def main(args: Array[String]): Unit = {
    val toolsMap = scala.collection.mutable.HashMap("gun" -> 1000D,"light" -> 30D,"pen" -> 20D)
    discount(toolsMap,0.9)
    //map²»±£Ö¤Ë³Ðò
    toolsMap.foreach(println(_))
  }
}

