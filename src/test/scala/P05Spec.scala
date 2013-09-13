
class P05Spec extends UnitSpec {

  it should "reverse a list" in {
    P05.reverse(List(1, 1, 2, 3, 5, 8)) should equal (List(8, 5, 3, 2, 1, 1))
  }

  it should "reverse a list using recursion" in {
    P05.reverseRecursive(List(1, 1, 2, 3, 5, 8)) should equal (List(8, 5, 3, 2, 1, 1))
  }

  it should "reverse a list using fold" in {
    P05.reverseFold(List(1, 1, 2, 3, 5, 8)) should equal (List(8, 5, 3, 2, 1, 1))
  }
}
