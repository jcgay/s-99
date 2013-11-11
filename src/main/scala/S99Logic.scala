
package logic {

object S99Logic {

  def not(a: Boolean) = a match {
    case true => false
    case false => true
  }

  def and(a: Boolean, b: Boolean) = (a, b) match {
    case (true, true) => true
    case _ => false
  }

  def or(a: Boolean, b: Boolean) = (a, b) match {
    case (false, false) => false
    case _ => true
  }

  def nand(a: Boolean, b: Boolean) = not(and(a, b))

  def nor(a: Boolean, b: Boolean) = not(or(a, b))

  def xor(a: Boolean, b: Boolean) = or(and(a, not(b)), and(not(a), b))

  def equ(a: Boolean, b:Boolean) = not(xor(a, b))

  def impl(a: Boolean, b:Boolean) = or(not(a), b)
}

}