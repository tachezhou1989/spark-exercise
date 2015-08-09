package tachezhou.exercise.scalaBasic.seventh
import java.util.{HashMap => JavaMap}
import scala.collection.mutable.{HashMap => ScalaMap}
/**
 * Created by Administrator on 2015/8/9 0009.
 * 对于包的重命名，只要不是产生冲突，最好不要使用，这会使得代码更难以让人读懂
 */
object mapConverse {
  val javaMap = new  JavaMap[String,String]()
  javaMap.put("hello","world")
  javaMap.put("tache","zhou")

  val scalaMap = new ScalaMap[String,String]()
  for(key <- javaMap.keySet().toArray()) {
    scalaMap.put(key.toString,javaMap.get(key))
  }
}
