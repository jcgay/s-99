import logic.S99Logic._
import org.scalatest.FlatSpec

class P47Spec extends FlatSpec {

  it should "operate a 'and' on booleans" in {
    assert((true and true) == true)
    assert((true and false) == false)
    assert((false and true) == false)
    assert((false and false) == false)
  }

  it should "operate a 'or' on booleans" in {
    assert((true or true) == true)
    assert((true or false) == true)
    assert((false or true) == true)
    assert((false or false) == false)
  }

  it should "operate a 'nand' on booleans" in {
    assert((true nand true) == false)
    assert((true nand false) == true)
    assert((false nand true) == true)
    assert((false nand false) == true)
  }

  it should "operate a 'nor' on booleans" in {
    assert((true nor true) == false)
    assert((true nor false) == false)
    assert((false nor true) == false)
    assert((false nor false) == true)
  }

  it should "operate a 'xor' on booleans" in {
    assert((true xor true) == false)
    assert((true xor false) == true)
    assert((false xor true) == true)
    assert((false xor false) == false)
  }

  it should "operate an 'equivalence' on booleans" in {
    assert((true equ true) == true)
    assert((true equ false) == false)
    assert((false equ true) == false)
    assert((false equ false) == true)
  }

  it should "operate an 'implication' on booleans" in {
    assert((true impl true) == true)
    assert((true impl false) == false)
    assert((false impl true) == true)
    assert((false impl false) == true)
  }
}
