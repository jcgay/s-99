import org.scalatest.FlatSpec

class P25Spec extends FlatSpec {

  it should "generate a random permutation of the elements of a list" in {
    val input: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f)
    val result: List[Symbol] = P25.randomPermute(input)

    assert(result.length === input.length)
    assert(result != input)
    result.foreach(e => assert(input.contains(e)))
  }
}
