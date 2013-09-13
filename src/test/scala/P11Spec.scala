
class P11Spec extends UnitSpec {

  it should "encode" in {
    P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }
}
