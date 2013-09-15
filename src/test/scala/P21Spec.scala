
class P21Spec extends UnitSpec {

  it should "insert an element at given position" in {
    P21.insertAt('new, 1, List('a, 'b, 'c, 'd)) should equal (List('a, 'new, 'b, 'c, 'd))
  }
}
