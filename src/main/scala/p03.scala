
object P03 {
  def nth[A](index: Int, elements: List[A]) = elements(index)

  def nthRecursive[A](index: Int, elements: List[A]): A = (index, elements) match {
    case (0, head :: tail) => head
    case (n, head :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }
}