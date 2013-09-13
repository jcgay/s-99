
object P13 {

  def encodeDirect[A](elements: List[A]): List[(Int, A)] = {
    if (elements.isEmpty) Nil
    else {
      val result: (List[A], List[A]) = elements span { _ == elements.head }
      (result._1.length, result._1.head) :: encodeDirect(result._2)
    }
  }
}
