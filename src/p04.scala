
def length[A](elements: List[A]) = elements.size

assert(length(List(1, 1, 2, 3, 5, 8)) == 6)

println("OK 1")

def lengthFold[A](elements: List[A]) = elements.foldLeft(0) { (size, _) => size + 1 }

assert(lengthFold(List(1, 1, 2, 3, 5, 8)) == 6)

println("OK 2")

def lengthRecursive[A](elements: List[A]): Int = elements match {
  case Nil => 0
  case head :: tail => 1 + lengthRecursive(tail)
}

assert(lengthRecursive(List(1, 1, 2, 3, 5, 8)) == 6)

println("OK 3")
