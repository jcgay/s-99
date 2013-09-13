
class P10Spec extends UnitSpec {

  it should "encode" in {
    P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}
