
def encodeDirect(symbols: List[Symbol]): List[(Int, Symbol)] = {
  if (symbols.isEmpty) Nil
  else {
    val result: (List[Symbol], List[Symbol]) = symbols span { _ == symbols.head }
    (result._1.length, result._1.head) :: encodeDirect(result._2)
  }
}

assert(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))

println("OK")
