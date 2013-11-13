import logic.S99Logic._
import org.scalatest.FlatSpec

class P46Spec extends FlatSpec {

  it should "negate a boolean" in {
    assert(not(true) == false)
    assert(not(false) == true)
  }
}
