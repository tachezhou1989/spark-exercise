package tachezhou.exercise.scala.third

import scala.collection.mutable

/**
 * Created by Administrator on 2015/7/26 0026.
 */
object Question6st {

  def showLinkedMap(): Unit = {
    val linkedMap = new mutable.LinkedHashMap[String,Int]
    linkedMap += ("Monday" -> java.util.Calendar.MONDAY) +=
      ("Sunday" -> java.util.Calendar.SUNDAY) +=
      ("Saturday" -> java.util.Calendar.SATURDAY)
    linkedMap.foreach(println(_))
  }

  def main(args: Array[String]): Unit = {
    showLinkedMap()
  }
}
