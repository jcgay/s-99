
object P10 {

  def encode[A](elements: List[A]) = {
    if (elements.isEmpty) List()
    else P09.pack(elements) map { a =>  (a.length, a.head)}
  }
}
