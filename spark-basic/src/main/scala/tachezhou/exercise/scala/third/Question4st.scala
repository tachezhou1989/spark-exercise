package tachezhou.exercise.scala.third

import java.io.File
import java.util
import java.util.{Collections, Scanner}
/**
 * Created by Administrator on 2015/7/26 0026.
 */
object Question4st {

  def wordCount(fileName: String): scala.collection.immutable.TreeMap[String,Int] = {
    val file = new File(Thread.currentThread().getContextClassLoader.getResource(fileName).toURI)
    val in = new Scanner(file)
    var map = new scala.collection.immutable.TreeMap[String,Int]
    while (in.hasNext) {
      val key = in.next()
      //执行了一个+操作，再执行了一个 = 操作
      map += key -> (map.getOrElse(key,0) + 1)
    }
    map
  }

  def main(args: Array[String]): Unit = {
    wordCount("text.txt").foreach(println(_))
  }

}
