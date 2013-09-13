
class P13Spec extends UnitSpec {

  it should "encode direct" in {
    P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}
