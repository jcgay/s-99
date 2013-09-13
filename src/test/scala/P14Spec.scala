
class P14Spec extends UnitSpec {

  it should "duplicate" in {
    P14.duplicate(List('a, 'b, 'c, 'c, 'd)) should equal (List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }
}
