package tachezhou.exercise.scalaBasic.fifth

/**
 * Created by Administrator on 2015/7/29 0029.
 */
/*
 用val更合适，因为var name会创建get和set,会造成
 这个类封闭性不够，关于这个的原因，还需要继续思考
 */
class Person2(val name: String) {
  val fisrtName = name.split(" ")(0)

  val secName = name.split(" ")(1)
}

object Person2 {
  def main(args: Array[String]) {
    val person = new Person2("tache zhou")
    println(person.fisrtName + " " + person.secName)
  }
}