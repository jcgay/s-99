
object P04 {
  def length[A](elements: List[A]) = elements.size

  def lengthFold[A](elements: List[A]) = elements.foldLeft(0) { (size, _) => size + 1 }

  def lengthRecursive[A](elements: List[A]): Int = elements match {
    case Nil => 0
    case head :: tail => 1 + lengthRecursive(tail)
  }
}

assert(P04.length(List(1, 1, 2, 3, 5, 8)) == 6)
println("OK 1")

assert(P04.lengthFold(List(1, 1, 2, 3, 5, 8)) == 6)
println("OK 2")

assert(P04.lengthRecursive(List(1, 1, 2, 3, 5, 8)) == 6)
println("OK 3")
