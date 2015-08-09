package tachezhou.exercise.scalaBasic.eighth

/**
 * Created by Administrator on 2015/8/9 0009.
 */
class Person8st(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}

class SecretAgent(codename: String) extends Person8st(codename) {
  override val name = "secret"
  override val toString = "secret"
}

//总共两个get,Person类的name取值是传进来的
//SecretAgent的name取值为secret