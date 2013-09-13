
class P06Spec extends UnitSpec {

  "A palindrome" should "be identified as one" in {
    P06.isPalindrome(List(1, 2, 3, 2, 1)) should be (true)
  }
}
