
def last[A](elements: List[A]) = elements.last

assert(last(List(1, 1, 2, 3, 5, 8)) == 8)
assert(last(List(1L, 1L, 2L, 3L, 5L, 8L)) == 8L)

println("OK 1")

def recursiveLast[A](elements: List[A]): A = elements match {
  case head :: Nil => head
  case head :: tail => recursiveLast(tail)
}

assert(recursiveLast(List(1, 1, 2, 3, 5, 8)) == 8)
assert(recursiveLast(List(1L, 1L, 2L, 3L, 5L, 8L)) == 8L)

println("OK 2")
