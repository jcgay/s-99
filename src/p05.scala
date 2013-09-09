
def reverse[A](elements: List[A]) = elements.reverse

assert(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))

println("OK 1")

def reverseRecursive[A](ints: List[A]): List[A] = ints match {
  case last :: Nil => List(last)
  case head :: tail => reverseRecursive(tail) :+ head
}

assert(reverseRecursive(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))

println("OK 2")

def reverseFold[A](elements: List[A]) = elements.foldLeft(List[A]()) ((a,b) => b :: a)

assert(reverseFold(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))

println("OK 3")

