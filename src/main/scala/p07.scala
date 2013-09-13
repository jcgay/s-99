
object P07 {

  def flatten(value: List[Any]): List[Any] = value flatMap {
    element => element match {
      case list: List[_] => flatten(list)
      case singleElement => List(element)
    }
  }
}
