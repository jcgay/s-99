
object P07 {

  def flatten(value: List[Any]): List[Any] = value flatMap {
    element => element match {
      case list: List[_] => flatten(list)
      case singleElement => List(element)
    }
  }
}

assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
println("OK 1")
