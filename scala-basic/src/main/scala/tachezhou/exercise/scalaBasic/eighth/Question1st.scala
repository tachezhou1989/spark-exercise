package tachezhou.exercise.scalaBasic.eighth

/**
 * Created by Administrator on 2015/8/9 0009.
 */
class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def depost(amount: Double) = {
    balance += amount; balance
  }

  def withdraw(amount: Double) = {
    balance -= amount; balance
  }

  def printlnBalance: Unit = {
    println(balance)
  }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  override def depost(amount: Double): Double = {
    super.depost(amount - 1)
  }

  override def withdraw(amount: Double) = {
     super.withdraw(amount - 1)
  }

}

object CheckingAccount {
  def main(args: Array[String]): Unit = {
    val bankAccount = new BankAccount(11)
    bankAccount.depost(2)
    bankAccount.printlnBalance

    val  checkingAccount = new CheckingAccount(11)
    checkingAccount.depost(2)
    checkingAccount.printlnBalance
  }
}