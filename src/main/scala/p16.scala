
object P16 {

  def drop[A](i: Int, elements: List[A]) = {
    def dropRecursive(count: Int, elements: List[A]): List[A] = (count, elements) match {
      case (_, Nil) => Nil
      case (1, head :: tail) => head :: dropRecursive(count + 1, tail)
      case (_, head :: tail) if (count % i == 0) => dropRecursive(count + 1, tail)
      case (_, head :: tail) => head :: dropRecursive(count + 1, tail)
    }
    dropRecursive(1, elements)
  }
}
