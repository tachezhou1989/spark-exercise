package tachezhou.exercise.scala.third

/**
 * Created by Administrator on 2015/7/26 0026.
 */
object Question10st {

  def showZipString(s1: String, s2: String): Unit = {
    val result = s1.zip(s2)
    result.foreach(println(_))
  }

  //zip操作将String当做char的数组来进行处理
  def showZipCharArray(a1: Array[Char],a2: Array[Char]): Unit = {
    val result = a1.zip(a2)
    result.foreach(println(_))
  }

  def main(args: Array[String]): Unit = {
    val a1 = Array('t','a','c','h','e')
    val a2 = Array('z','h','o','u')
    showZipString("tache","zhou")
    showZipCharArray(a1,a2)
  }
}
