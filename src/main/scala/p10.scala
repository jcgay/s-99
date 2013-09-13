
object P10 {

  def encode(symbols: List[Symbol]) = P09.pack(symbols) map { a =>  (a.length, a.head)}
}
