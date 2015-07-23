package tachezhou.exercise.scala.third

import java.io.File
import java.util.Scanner

/**
 * Created by Administrator on 2015/7/23 0023.
 */
object Question2st {

  //必须显示指定hashMap的范型
  def wordCount(fileName: String): scala.collection.mutable.HashMap[String,Int] = {
    val result = new scala.collection.mutable.HashMap[String,Int]
    val file = new File(Thread.currentThread().getContextClassLoader.getResource(fileName).toURI)
    val in = new Scanner(file)
    while(in.hasNext()) {
       val key  = in.next()
       result(key) = result.getOrElse(key,0) + 1
    }
    result
  }

  def main(args: Array[String]): Unit = {
    wordCount("text.txt").foreach(println(_))
  }
}
