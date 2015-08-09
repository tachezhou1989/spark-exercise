package tachezhou.exercise.scalaBasic.fourth

import java.io.File
import java.util.Scanner

import scala.collection.immutable.HashMap

/**
 * Created by Administrator on 2015/7/23 0023.
 */
object Question3st {
  def wordCount(fileName: String): Map[String,Int] = {
    val file = new File(Thread.currentThread().getContextClassLoader.getResource(fileName).toURI)
    val in = new Scanner(file)
    var map = new HashMap[String,Int]
    while(in.hasNext()) {
      val key  = in.next()
      val newvalue = map.getOrElse(key,0) + 1
      map += (key -> newvalue)
    }
    map
  }

  def main(args: Array[String]): Unit = {
    wordCount("text.txt").foreach(println(_))
  }
}
