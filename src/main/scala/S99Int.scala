package arithmetic {

class S99Int(val start: Int) {
  def isPrime: Boolean = start > 1 && ((2 to Math.sqrt(start).toInt) forall { start % _ != 0 })
}

object S99Int {
  import scala.language.implicitConversions
  implicit def int2S99Int(i: Int): S99Int = new S99Int(i)
}

}
