
object P12 {

  def decode[A](encoded: List[(Int, A)]) = encoded flatMap { a => List.fill(a._1)(a._2) }
}
