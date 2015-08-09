package tachezhou.exercise.scalaBasic.fourth

import java.io.File
import java.util.Scanner
//����������������
import scala.collection.JavaConversions.mapAsScalaMap

/**
 * Created by Administrator on 2015/7/26 0026.
 */
object Question5st {
  def wordCount(fileName: String): scala.collection.mutable.Map[String,Int] = {
    val file = new File(Thread.currentThread().getContextClassLoader.getResource(fileName).toURI)
    val in = new Scanner(file)
    val map:scala.collection.mutable.Map[String,Int] = new java.util.TreeMap[String,Int]()
    while (in.hasNext) {
      val key = in.next()
      map.put(key,map.getOrElse(key,0) + 1)
    }
    map
  }

  def main(args: Array[String]): Unit = {
    wordCount("text.txt").foreach(println(_))
  }
}
