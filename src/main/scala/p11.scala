
object P11 {

  def pack(symbols: List[Symbol]): List[List[Symbol]] = {
    val result: (List[Symbol], List[Symbol]) = symbols span { _ == symbols.head }
    if (result._2 == Nil) List(result._1) else result._1 :: pack(result._2)
  }

  def encode(symbols: List[Symbol]) = pack(symbols) map { a =>  (a.length, a.head)}

  def encodeModified(symbols: List[Symbol]) = encode(symbols) map { a => if (a._1 == 1) a._2 else a }
}

assert(P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  == List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
println("OK")
