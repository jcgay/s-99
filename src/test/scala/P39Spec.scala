import arithmetic.S99Int

class P39Spec extends UnitSpec {

  it should "return a list of prime numbers." in {
    assert(S99Int.listPrimesInRange(7 to 31) == List(7, 11, 13, 17, 19, 23, 29, 31))
  }
}
