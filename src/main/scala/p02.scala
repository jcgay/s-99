object P02 {
  def penultimate[A](elements: List[A]) = elements.init.last

  def penultimateRecursive[A](elements: List[A]): A = elements match {
    case lastButOne :: last :: Nil => lastButOne
    case head :: tail => penultimateRecursive(tail)
  }
}

assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
assert(P02.penultimate(List(1L, 1L, 2L, 3L, 5L, 8L)) == 5L)
println("OK 1")

assert(P02.penultimateRecursive(List(1, 1, 2, 3, 5, 8)) == 5)
println("OK 2")
