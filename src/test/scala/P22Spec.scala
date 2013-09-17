
class P22Spec extends UnitSpec {

  it should "create a list containing all integers within a given range" in {
    P22.range(4, 9) should equal (List(4, 5, 6, 7, 8, 9))
  }

  it should "create a list containing all integers within a given range using recursion" in {
    P22.rangeRecursive(4, 9) should equal (List(4, 5, 6, 7, 8, 9))
  }
}
