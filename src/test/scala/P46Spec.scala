import logic.S99Logic._
import org.scalatest.FlatSpec

class P46Spec extends FlatSpec {

  it should "negate a boolean" in {
    assert(not(true) == false)
    assert(not(false) == true)
  }

  it should "operate a 'and' on booleans" in {
    assert(and(true, true) == true)
    assert(and(true, false) == false)
    assert(and(false, true) == false)
    assert(and(false, false) == false)
  }

  it should "operate a 'or' on booleans" in {
    assert(or(true, true) == true)
    assert(or(true, false) == true)
    assert(or(false, true) == true)
    assert(or(false, false) == false)
  }

  it should "operate a 'nand' on booleans" in {
    assert(nand(true, true) == false)
    assert(nand(true, false) == true)
    assert(nand(false, true) == true)
    assert(nand(false, false) == true)
  }

  it should "operate a 'nor' on booleans" in {
    assert(nor(true, true) == false)
    assert(nor(true, false) == false)
    assert(nor(false, true) == false)
    assert(nor(false, false) == true)
  }

  it should "operate a 'xor' on booleans" in {
    assert(xor(true, true) == false)
    assert(xor(true, false) == true)
    assert(xor(false, true) == true)
    assert(xor(false, false) == false)
  }

  it should "operate an 'equivalence' on booleans" in {
    assert(equ(true, true) == true)
    assert(equ(true, false) == false)
    assert(equ(false, true) == false)
    assert(equ(false, false) == true)
  }

  it should "operate an 'implication' on booleans" in {
    assert(impl(true, true) == true)
    assert(impl(true, false) == false)
    assert(impl(false, true) == true)
    assert(impl(false, false) == true)
  }
}
