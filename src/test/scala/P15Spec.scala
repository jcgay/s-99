
class P15Spec extends UnitSpec {

  it should "duplicate" in {
    P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should equal (List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }
}
