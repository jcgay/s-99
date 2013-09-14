
object P20 {

  def removeAt[A](index: Int, elements: List[A]) = (elements diff List(elements(index)), elements(index))

  def anotherRemoveAt[A](index: Int, elements: List[A]): (List[A], A) = elements.splitAt(index) match {
    case (_, Nil) => throw new NoSuchElementException
    case (pre, head :: tail) => (pre ::: tail, head)
  }
}
