package tachezhou.exercise.scalaBasic.eighth

/**
 * Created by Administrator on 2015/8/9 0009.
 */
class Animal(var weights: Int, height: Int) {
   def loseWeights(lose: Int): Unit = {
     weights = weights - lose
   }
}

class Dog(weights: Int,height: Int,howlSound: String) extends Animal(weights: Int, height: Int) {
   override def loseWeights(lose: Int): Unit = {
     super.loseWeights(lose - 1)
   }

   def howl(): Unit = {
     println(this.howlSound)
   }
}

object Dog {
  def main(args: Array[String]): Unit = {
    val dog = new Dog(12,10,"wang")
    dog.howl()
  }
}