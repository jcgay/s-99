import org.scalatest.FlatSpec
import arithmetic.S99Int._

class P37Spec extends FlatSpec {

  it should "calculate Euler's totient function phi(m)" in {
    assert(1.totientImproved == 1)
    assert(2.totientImproved == 1)
    assert(4.totientImproved == 2)
  }
}
