
object P15 {

  def duplicateN(i: Int, symbols: List[Symbol]) = symbols flatMap { a => List.fill(i)(a) }
}
