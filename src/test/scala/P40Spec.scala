import org.scalatest.FlatSpec
import arithmetic.S99Int._

class P40Spec extends FlatSpec {

  it should "calculate Goldbach's conjecture" in {
    assert(28.goldbach == (5, 23))
    assert(6.goldbach == (3, 3))
    assert(8.goldbach == (3, 5))
    assert(12.goldbach == (5, 7))
    assert(10.goldbach == (3, 7) || 10.goldbach == (5, 5))
    assert(14.goldbach == (3, 11) || 10.goldbach == (7, 7))
  }
}
