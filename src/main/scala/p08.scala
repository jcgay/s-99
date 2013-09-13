
object P08 {

  def compress(symbols: List[Symbol]) = symbols.foldLeft(List[Symbol]()) (
    (result, element) => if (result.isEmpty || result.last != element) result :+ element else result
  )

  def compressRecursive(symbols: List[Symbol]): List[Symbol] = symbols match {
    case Nil => Nil
    case head :: Nil => List(head)
    case head :: tail => if (head == tail.head) compressRecursive(tail) else head :: compressRecursive(tail)
  }
}
