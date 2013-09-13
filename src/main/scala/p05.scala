
object P05 {
  def reverse[A](elements: List[A]) = elements.reverse

  def reverseRecursive[A](ints: List[A]): List[A] = ints match {
    case last :: Nil => List(last)
    case head :: tail => reverseRecursive(tail) :+ head
  }

  def reverseFold[A](elements: List[A]) = elements.foldLeft(List[A]()) ((a,b) => b :: a)
}
