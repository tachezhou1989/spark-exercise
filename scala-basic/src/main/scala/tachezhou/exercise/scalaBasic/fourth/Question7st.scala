package tachezhou.exercise.scalaBasic.fourth

import java.util.Properties

import scala.collection.immutable.HashMap

/**
 * Created by Administrator on 2015/7/26 0026.
 */
object Question7st {
  def showJavaPros(): Unit = {
    val pros = System.getProperties
    var maxKeylength = 0
    //find the max length
    pros.keySet().toArray.foreach( key => {
      if (key.toString.length > maxKeylength) {
        maxKeylength = key.toString.length
      }
    })
    //print
    pros.keySet().toArray().foreach( key => {
      print(key)
      for( i <- 0 until (maxKeylength - key.toString.length)) {
        print(" ")
      }
      print("| ")
      print(pros.get(key))
      println()
    })
  }

  def main(args: Array[String]): Unit = {
    showJavaPros()
  }
}
