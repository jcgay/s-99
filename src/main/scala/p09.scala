
object P09 {

  def pack(symbols: List[Symbol]): List[List[Symbol]] = {
    val result: (List[Symbol], List[Symbol]) = symbols span { _ == symbols.head }
    if (result._2 == Nil) List(result._1) else result._1 :: pack(result._2)
  }
}
