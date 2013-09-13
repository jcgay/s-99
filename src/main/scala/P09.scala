
object P09 {

  def pack[A](elements: List[A]): List[List[A]] = {
    val result: (List[A], List[A]) = elements span { _ == elements.head }
    if (result._2 == Nil) List(result._1) else result._1 :: pack(result._2)
  }
}
