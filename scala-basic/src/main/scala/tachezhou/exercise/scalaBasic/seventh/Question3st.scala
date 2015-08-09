package tachezhou.exercise.scalaBasic.seventh

/**
 * Created by Administrator on 2015/8/4 0004.
 */
package random {

}

package object random {
  //看下单元测试里面的
  private var seed: Int = _

  private var before = seed.toDouble

  private val a = 1664525

  private val b = 1013904233

  private val n = 32D

  def setSeed(seed: Int): Unit = {
    this.seed = seed
  }

  def nextInt(): Int = {
    val result = (before * a + b)% math.pow(2D,n)
    before = result
    result.toInt
  }

  def nextDouble(): Double = {
    val result = (before * a + b)% math.pow(2D,n)
    before = result
    result
  }
}
