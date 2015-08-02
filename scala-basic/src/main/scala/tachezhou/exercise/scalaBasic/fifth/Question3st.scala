package tachezhou.exercise.scalaBasic.fifth

/**
 * Created by Administrator on 2015/7/29 0029.
 */
class Time(val hours: Int, val mins: Int) {

  require(hours > 0 && hours < 24, "hours must be between 0 and 24")
  require(mins > 0 && mins < 60, "mins must be between 0 and 60")

  def before(other: Time): Boolean = {
    if (this.hours * 60 + this.mins < other.hours * 60 + other.mins) {
      return true
    }
    return false
  }
}

object Time {
  def main(args: Array[String]): Unit = {
    val time = new Time(23,3)
    println(time.before(new Time(22,3)))
  }
}
