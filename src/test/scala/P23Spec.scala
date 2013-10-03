
class P23Spec extends UnitSpec {

  it should "extract a given number of randomly selected elements from a list" in {
    P23.randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)) should (contain ('a') or contain ('b') or contain('d') or contain('f') or contain('g) or contain('h) and have size (3))
  }
}
