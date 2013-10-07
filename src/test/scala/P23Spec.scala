import org.scalatest.FlatSpec

class P23Spec extends FlatSpec {

  it should "extract a given number of randomly selected elements from a list" in {
    val source: List[Symbol] = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val result: List[Symbol] = P23.randomSelect(3, source)

    assert(result.length === 3)
    result.foreach(e => assert(source.contains(e)))
  }
}
