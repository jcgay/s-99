import org.scalatest.FlatSpec
import arithmetic.S99Int._

class P34Spec extends FlatSpec {

  it should "calculate Euler's totient function phi(m)" in {
    assert(10.totient == 4)
  }
}
