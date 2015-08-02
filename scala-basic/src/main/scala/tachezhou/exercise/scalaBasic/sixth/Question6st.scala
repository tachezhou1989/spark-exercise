package tachezhou.exercise.scalaBasic.sixth

/**
 * Created by Administrator on 2015/8/2 0002.
 */
object Question6st extends Enumeration {

  val spade = Value("SPADE")

  val black = Value("BLACK")

  val club = Value("CLUB")

  val diamond = Value("DIAMOND")

  def main(args: Array[String]): Unit = {
    println(Question6st.spade.toString)
  }
}
