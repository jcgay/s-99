package arithmetic {

import arithmetic.S99Int._

class S99Int(val start: Int) {
  def isPrime: Boolean = start > 1 && ((2 to Math.sqrt(start).toInt) forall { start % _ != 0 })

  def isCoprime(value: Int) = S99Int.gcd(start, value) == 1

  def totient: Int = ((1 to start) filter { start.isCoprime(_) }).size
}

object S99Int {
  import scala.language.implicitConversions
  implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

  def gcd(a: Int, b: Int): Int = (a, b) match {
    case (a, 0) => a
    case (a, b) => gcd(b, a % b)
  }
}

}
