
object P15 {

  def duplicateN[A](i: Int, symbols: List[A]) = symbols flatMap { a => List.fill(i)(a) }
}
