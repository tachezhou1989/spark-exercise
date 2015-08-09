package tachezhou.exercise.scalaBasic.seventh

/**
 * Created by Administrator on 2015/8/9 0009.
 */
object mapConverseSRange {
  import java.util.{HashMap => JavaMap}
  val javaMap = new JavaMap[String,String]()
  javaMap.put("hello","world")
  javaMap.put("tache","zhou")

  import scala.collection.mutable.{HashMap => ScalaMap}
  val scalaMap = new ScalaMap[String,String]()
  for(key <- javaMap.keySet().toArray()) {
    scalaMap.put(key.toString,javaMap.get(key))
  }
}
