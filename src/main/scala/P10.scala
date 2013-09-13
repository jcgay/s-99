
object P10 {

  def encode[A](elements: List[A]) = P09.pack(elements) map { a =>  (a.length, a.head)}
}
