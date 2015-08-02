package tachezhou.exercise.scalaBasic.fifth

/**
 * Created by Administrator on 2015/8/1 0001.
 * 采用书中所写方法，一是灵活，二是简洁
 */
class Employee {

  val name = "johnQ .public"

  var salary = 0.0D

  def this(salary: Double) {
    this()
    this.salary = salary
  }
}