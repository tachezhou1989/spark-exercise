package tachezhou.exercise.scalaBasic.sixth

/**
 * Created by Administrator on 2015/8/2 0002.
 */
object checkColor {
  def doWhat(color : Question6st.Value): Boolean = {
    if (color.toString.equals("SPADE")) {
      return true
    }
    return false
  }

  def main(args: Array[String]): Unit = {
    println(doWhat(Question6st.spade))
  }
}
