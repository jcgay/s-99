
object P14 {

  def duplicate[A](elements: List[A]) = elements flatMap { a => List.fill(2)(a) }
}
