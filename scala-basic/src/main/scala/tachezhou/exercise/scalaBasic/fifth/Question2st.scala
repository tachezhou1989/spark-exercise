package tachezhou.exercise.scalaBasic.fifth

/**
 * Created by Administrator on 2015/7/29 0029.
 */
class BankAccount {

  val balance = 0

  def depost(): Unit = {
    println("the method of depost")
  }

  def withdraw() = {
    println("the method of withdraw")
  }

}

object BankAccount {
  def main(args: Array[String]): Unit = {
    val ba = new BankAccount()
    println("the balance is read only,and the value is" + ba.balance)
  }
}