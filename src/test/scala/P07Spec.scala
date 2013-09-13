
class P07Spec extends UnitSpec {

  it should "flatten" in {
    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should equal (List(1, 1, 2, 3, 5, 8))
  }
}
