
object P14 {

  def duplicate(symbols: List[Symbol]) = symbols flatMap { a => List.fill(2)(a) }
}
