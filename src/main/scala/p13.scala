
object P13 {

  def encodeDirect(symbols: List[Symbol]): List[(Int, Symbol)] = {
    if (symbols.isEmpty) Nil
    else {
      val result: (List[Symbol], List[Symbol]) = symbols span { _ == symbols.head }
      (result._1.length, result._1.head) :: encodeDirect(result._2)
    }
  }
}
