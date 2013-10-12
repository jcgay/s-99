
import arithmetic.S99Int._

class P31Spec extends UnitSpec {

  it should "return true when an integer number is prime" in {
    2.isPrime should be (true)
    3.isPrime should be (true)
    5.isPrime should be (true)
    7.isPrime should be (true)
    11.isPrime should be (true)
    13.isPrime should be (true)
    17.isPrime should be (true)
    71.isPrime should be (true)
  }

  it should "return false when an integer number is not prime" in {
    0.isPrime should be (false)
    1.isPrime should be (false)
    4.isPrime should be (false)
    6.isPrime should be (false)
    60.isPrime should be (false)
    68.isPrime should be (false)
    82.isPrime should be (false)
  }
}
