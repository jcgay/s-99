
class P08Spec extends UnitSpec {

  it should "compress" in {
    P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List('a, 'b, 'c, 'a, 'd, 'e))
  }

  it should "compress using recursion" in {
    P08.compressRecursive(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List('a, 'b, 'c, 'a, 'd, 'e))
  }
}
