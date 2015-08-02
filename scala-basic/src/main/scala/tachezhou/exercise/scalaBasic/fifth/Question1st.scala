package tachezhou.exercise.scalaBasic.fifth

/**
 * Created by Administrator on 2015/7/29 0029.
 */
class Counter {
  private var value = 0

  def increment() {
    if (value < Int.MaxValue) value += 1;
    else return value
  }
}
