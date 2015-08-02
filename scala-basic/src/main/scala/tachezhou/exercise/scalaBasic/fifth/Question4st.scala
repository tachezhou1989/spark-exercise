package tachezhou.exercise.scalaBasic.fifth

/**
 * Created by Administrator on 2015/7/29 0029.
 */

class Time2(val hours: Int, val mins: Int) {

  require(hours * 60 + mins > 0 && hours * 60 + mins < 24 * 60, "hours must be between 0 and 24")

  def before(other: Time): Boolean = {
    if (this.hours * 60 + this.mins < other.hours * 60 + other.mins) {
      return true
    }
    return false
  }
}

