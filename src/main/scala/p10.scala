
object P10 {

  def pack(symbols: List[Symbol]): List[List[Symbol]] = {
    val result: (List[Symbol], List[Symbol]) = symbols span { _ == symbols.head }
    if (result._2 == Nil) List(result._1) else result._1 :: pack(result._2)
  }

  def encode(symbols: List[Symbol]) = pack(symbols) map { a =>  (a.length, a.head)}
}

assert(P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
println("OK")
