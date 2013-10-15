import org.scalatest.FlatSpec
import arithmetic.S99Int._

class P33Spec extends FlatSpec {

  it should "determine whether two positive integer numbers are coprime" in {
    assert(35.isCoprime(64))
    assert(14.isCoprime(15))
  }

  it should "return false when two positive integers are not coprime" in {
    assert(14.isCoprime(21) == false)
  }
}
