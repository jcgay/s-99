
def pack(symbols: List[Symbol]): List[List[Symbol]] = {
  val result: (List[Symbol], List[Symbol]) = symbols span { _ == symbols.head }
  if (result._2 == Nil) List(result._1) else result._1 :: pack(result._2)
}

assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))

println("OK")
