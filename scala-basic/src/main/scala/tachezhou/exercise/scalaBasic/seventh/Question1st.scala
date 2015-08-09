package tachezhou.exercise.scalaBasic.seventh

/**
 * Created by Administrator on 2015/8/4 0004.
 */

package com {
  package hourstman {
    class PersonH {
      val name = "Tache"
    }
    //相当于内部类，可以访问同级对象
    package impatitient {
     class PersonHSec {
      val name = new PersonH().name
     }
    }
  }
}

package com.hourstman.impatitient {
class PersonHthird {
    //不能访问，必须通过全部名称
    val name = new tachezhou.exercise.scalaBasic.seventh.com.hourstman.PersonH().name
  }
}
