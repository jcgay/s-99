
object P17 {

  def split[A](index: Int, elements: List[A]) = elements.splitAt(index)

  def splitRecursive[A](index: Int, elements: List[A]): (List[A], List[A]) = (index, elements) match {
    case (_, Nil) => (Nil, Nil)
    case (0, values) => (List(), values)
    case (_, head :: tail) => {
      val (before, after) = splitRecursive(index - 1, tail)
      (head :: before, after)
    }
  }
}
