
class P16Spec extends UnitSpec {

  it should "drop element at specified index" in  {
    P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal (List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }
}
