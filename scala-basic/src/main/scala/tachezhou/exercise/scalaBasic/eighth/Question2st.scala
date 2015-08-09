package tachezhou.exercise.scalaBasic.eighth

/**
 * Created by Administrator on 2015/8/9 0009.
 */
class SavingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var num: Int = _

  def earnMouthlyInterest(): Unit = {
    num = 3
    super.depost(1)
  }

  override def withdraw(amount: Double) = {
    if (num > 0) {
      num -= 1;
      super.withdraw(amount)
    } else {
      super.withdraw(amount - 1)
    }
  }

  override def depost(amount: Double): Double = {
    if (num > 0) {
      num -= 1;
      super.depost(amount)
    } else {
      super.depost(amount - 1)
    }
  }
}
object SavingAccount {
  def main(args: Array[String]): Unit = {
    val sa = new SavingAccount(13)
    sa.earnMouthlyInterest()
    sa.depost(1)
    sa.depost(1)
    sa.depost(1)
    sa.depost(1)
    sa.printlnBalance
  }
}