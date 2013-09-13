
object P07 {

  def flatten(value: List[Any]): List[Any] = value flatMap {
    case list: List[_] => flatten(list)
    case singleElement => List(singleElement)
  }
}
