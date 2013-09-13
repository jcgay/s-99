
object P05 {
  def reverse[A](elements: List[A]) = elements.reverse

  def reverseRecursive[A](ints: List[A]): List[A] = ints match {
    case last :: Nil => List(last)
    case head :: tail => reverseRecursive(tail) :+ head
  }

  def reverseFold[A](elements: List[A]) = elements.foldLeft(List[A]()) ((a,b) => b :: a)
}


assert(P05.reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
println("OK 1")

assert(P05.reverseRecursive(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
println("OK 2")

assert(P05.reverseFold(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
println("OK 3")

