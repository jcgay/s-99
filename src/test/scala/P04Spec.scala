
class P04Spec extends UnitSpec {

  it should "return collection length" in {
    P04.length(List(1, 1, 2, 3, 5, 8)) should equal (6)
  }

  it should "return collection length using fold" in {
    P04.lengthFold(List(1, 1, 2, 3, 5, 8)) should equal(6)
  }

  it should "return collection length using recursion" in {
    P04.lengthRecursive(List(1, 1, 2, 3, 5, 8)) should equal (6)
  }
}
