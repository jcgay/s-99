
object P04 {
  def length[A](elements: List[A]) = elements.size

  def lengthFold[A](elements: List[A]) = elements.foldLeft(0) { (size, _) => size + 1 }

  def lengthRecursive[A](elements: List[A]): Int = elements match {
    case Nil => 0
    case head :: tail => 1 + lengthRecursive(tail)
  }
}
