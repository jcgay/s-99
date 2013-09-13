
object P08 {

  def compress[A](elements: List[A]) = elements.foldLeft(List[A]()) (
    (result, element) => if (result.isEmpty || result.last != element) result :+ element else result
  )

  def compressRecursive[A](elements: List[A]): List[A] = elements match {
    case Nil => Nil
    case head :: Nil => List(head)
    case head :: tail => if (head == tail.head) compressRecursive(tail) else head :: compressRecursive(tail)
  }
}
