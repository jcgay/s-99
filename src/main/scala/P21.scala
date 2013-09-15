
object P21 {

  def insertAt[A](element: A, index: Int, elements: List[A]) = elements.splitAt(index) match {
    case (pre, post) => pre ::: element :: post
  }
}
