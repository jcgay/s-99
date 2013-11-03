import org.scalatest.FlatSpec
import arithmetic.S99Int._

class P36Spec extends FlatSpec {

  it should "determine the prime factors of a given positive integer" in {
    assert(315.primeFactorMultiplicity == List((3,2), (5,1), (7,1)))
  }
}
