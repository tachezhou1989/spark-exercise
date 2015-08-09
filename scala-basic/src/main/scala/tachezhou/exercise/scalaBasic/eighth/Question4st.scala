package tachezhou.exercise.scalaBasic.eighth

import java.util

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Administrator on 2015/8/9 0009.
 */
abstract class Item {
  def price: Int

  def description: String
}

class SimpleItem(override val price: Int, override val description: String) extends Item {

}

class Bundle extends Item {
  private val items = new ArrayBuffer[Item]()

  def addItem(item: Item): Unit = {
    items += item
  }

  def price: Int = {
     var totle = 0
     items.foreach(totle += _.price)
     totle
  }

  def description: String = {
     "the size of item is " + items.size
  }

}

object Bundle {
  def main(args: Array[String]): Unit = {
    val bundle = new Bundle

    bundle.addItem(new SimpleItem(11,"item1"))
    bundle.addItem(new SimpleItem(12,"item2"))

    println(bundle.description)
    println(bundle.price)
  }
}