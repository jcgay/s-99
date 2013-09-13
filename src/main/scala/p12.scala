
object P12 {

  def decode(encoded: List[(Int, Symbol)]) = encoded flatMap { a => List.fill(a._1)(a._2) }
}
