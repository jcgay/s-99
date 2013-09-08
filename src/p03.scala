
def nth[A](index: Int, elements: List[A]) = elements(index)

assert(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)

println("OK 1")

def nthRecursive[A](index: Int, elements: List[A]): A = (index, elements) match {
  case (0, head :: tail) => head
  case (n, head :: tail) => nthRecursive(n - 1, tail)
  case (_, Nil) => throw new NoSuchElementException
}

assert(nthRecursive(2, List(1, 1, 2, 3, 5, 8)) == 2)

println("OK 2")
