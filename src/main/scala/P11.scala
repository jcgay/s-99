
object P11 {

  def encodeModified[A](elements: List[A]) = P10.encode(elements) map { a => if (a._1 == 1) a._2 else a }
}
