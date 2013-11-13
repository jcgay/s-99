
package logic {

class S99Logic(val a: Boolean) {
  import S99Logic._

  def and(b: Boolean) = (a, b) match {
    case (true, true) => true
    case _ => false
  }

  def or(b: Boolean) = (a, b) match {
    case (false, false) => false
    case _ => true
  }

  def nand(b: Boolean) = not(and(b))

  def nor(b: Boolean) = not(or(b))

  def xor(b: Boolean) = (a and not(b)) or (not(a) and b)

  def equ(b: Boolean) = not(xor(b))

  def impl(b: Boolean) = not(a) or b
}

object S99Logic {
  import scala.language.implicitConversions
  implicit def boolean2S99Logic(a: Boolean): S99Logic = new S99Logic(a)

  def not(a: Boolean) = a match {
    case true => false
    case false => true
  }
}

}