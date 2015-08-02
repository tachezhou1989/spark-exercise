package tachezhou.exercise.scalaBasic.fifth


/**
 * Created by Administrator on 2015/8/1 0001.
 */
class Car (val manufacturer: String,val model: String) {

  var year = -1
  var plate = ""

  def this(manufacturer: String,model: String, year: Int) {
    this(manufacturer,model)
    this.year = year
  }

  def this(manufacturer: String,model: String, plate: String) {
    this(manufacturer,model)
    this.plate = plate
  }

  //为什么不能用val，辅助构造器的变量并不会转为类成员，所以调用者根本不知道底层实现的是val还是var
  def this(manufacturer: String,model: String,year: Int, plate: String) {
    this(manufacturer,model)
    this.year = year
    this.plate = plate
  }
}
