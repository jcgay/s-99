
def compress(symbols: List[Symbol]) = symbols.foldLeft(List[Symbol]()) (
  (result, element) => if (result.isEmpty || result.last != element) result :+ element else result
)

assert(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))

println("OK 1")

def compressRecursive(symbols: List[Symbol]): List[Symbol] = symbols match {
  case Nil => Nil
  case head :: Nil => List(head)
  case head :: tail => if (head == tail.head) compressRecursive(tail) else head :: compressRecursive(tail)
}

assert(compressRecursive(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))

println("OK 2")
