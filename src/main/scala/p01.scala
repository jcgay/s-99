
object P01 {
  def last[A](elements: List[A]) = elements.last

  def recursiveLast[A](elements: List[A]): A = elements match {
    case head :: Nil => head
    case head :: tail => recursiveLast(tail)
  }
}
