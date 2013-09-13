
object P14 {

  def duplicate[A](elements: List[A]) = elements flatMap { List.fill(2)(_) }
}
