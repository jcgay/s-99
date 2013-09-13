
object P06 {
  def isPalindrome[A](elements: List[A]): Boolean = elements == elements.reverse
}

assert(P06.isPalindrome(List(1, 2, 3, 2, 1)))
println("OK")
