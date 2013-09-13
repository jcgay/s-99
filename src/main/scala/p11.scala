
object P11 {

  def encodeModified(symbols: List[Symbol]) = P10.encode(symbols) map { a => if (a._1 == 1) a._2 else a }
}
