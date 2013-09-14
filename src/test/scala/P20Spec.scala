
class P20Spec extends UnitSpec {

  it should "remove the Kth element from a list" in {
    P20.removeAt(1, List('a, 'b, 'c, 'd)) should equal ((List('a, 'c, 'd),'b))
  }

  it should "remove the Kth element from a list (another implementation)" in {
    P20.anotherRemoveAt(1, List('a, 'b, 'c, 'd)) should equal ((List('a, 'c, 'd),'b))
  }
}
