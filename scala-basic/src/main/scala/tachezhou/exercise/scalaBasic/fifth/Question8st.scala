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


  def this(manufacturer: String,model: String,year: Int, plate: String) {
    this(manufacturer,model)
    this.year = year
    this.plate = plate
  }
}
