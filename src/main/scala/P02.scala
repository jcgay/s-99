
object P02 {
  def penultimate[A](elements: List[A]) = elements.init.last

  def penultimateRecursive[A](elements: List[A]): A = elements match {
    case lastButOne :: last :: Nil => lastButOne
    case head :: tail => penultimateRecursive(tail)
  }
}
