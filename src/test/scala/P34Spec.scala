import org.scalatest.FlatSpec
import arithmetic.S99Int._

class P34Spec extends FlatSpec {

  it should "calculate Euler's totient function phi(m)" in {
    assert(1.totient == 1)
    assert(2.totient == 1)
    assert(3.totient == 2)
    assert(4.totient == 2)
    assert(5.totient == 4)
    assert(6.totient == 2)
    assert(7.totient == 6)
    assert(8.totient == 4)
    assert(9.totient == 6)
    assert(10.totient == 4)
  }
}
