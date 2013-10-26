import arithmetic.S99Int._

class P35Spec extends UnitSpec {

  it should "determine the prime factors of a given positive integer" in {
    2088.primeFactors should equal (List(2, 2, 2, 3, 3, 29))
    315.primeFactors should equal (List(3, 3, 5, 7))
  }
}
