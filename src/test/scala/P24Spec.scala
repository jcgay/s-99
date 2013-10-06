import org.scalatest.FlatSpec

class P24Spec extends FlatSpec {

  it should "draw N different random numbers from the set 1..M." in {
    P24.lotto(6, 49).foreach( it => assert(it < 49))
  }
}
