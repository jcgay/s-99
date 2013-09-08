
def penultimate[A](elements: List[A]) = elements.init.last

assert(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
assert(penultimate(List(1L, 1L, 2L, 3L, 5L, 8L)) == 5L)

println("OK 1")

def penultimateRecursive[A](elements: List[A]): A = elements match {
  case lastButOne :: last :: Nil => lastButOne
  case head :: tail => penultimateRecursive(tail)
}

assert(penultimateRecursive(List(1, 1, 2, 3, 5, 8)) == 5)

println("OK 2")
