package tachezhou.exercise.scalaBasic.seventh
import java.lang.System
/**
 * Created by Administrator on 2015/8/9 0009.
 */
object judgePassWord {

  def judge(password: String): Unit = {
    val userName = System.getProperty("user.name")
    if (password.equals("secret")) {
      System.out.print("Hello")
    } else {
      System.out.print("error")
    }
  }

  def main(args: Array[String]): Unit = {
    val password = Console.readLine()
    judge(password)
  }
}
