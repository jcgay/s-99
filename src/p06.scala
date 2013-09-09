
def isPalindrome[A](elements: List[A]): Boolean = elements == elements.reverse

assert(isPalindrome(List(1, 2, 3, 2, 1)))

println("OK")
