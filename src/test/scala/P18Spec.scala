
class P18Spec extends UnitSpec {

  it should "slice" in {
    P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal (List('d, 'e, 'f, 'g))
  }
}
