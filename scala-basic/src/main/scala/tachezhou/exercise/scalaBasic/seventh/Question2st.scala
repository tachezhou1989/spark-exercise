package tachezhou.exercise.scalaBasic.seventh

/**
 * Created by Administrator on 2015/8/4 0004.
 */
/**
 * Created by Administrator on 2015/8/4 0004.
 */
package org.apache.spark {
  class Person {
    val name = "tachezhou"
  }
}

//利用同一个包下命令包来达到困惑的目的，原因scala的包是相对的
package com {
  class Person {
    val name = new org.apache.spark.Person().name
  }
}

