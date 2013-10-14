import arithmetic.S99Int
import org.scalatest.FlatSpec

class P32Spec extends FlatSpec {

  it should "find greatest common divisor of two positive integer numbers" in {
    assert(S99Int.gcd(36, 63) === 9)
    assert(S99Int.gcd(10, 0) === 10)
    assert(S99Int.gcd(1071, 1029) === 21)
  }
}
