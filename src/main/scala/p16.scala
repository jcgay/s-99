
object P16 {

  def drop(i: Int, symbols: List[Symbol]) = {
    def dropRecursive(count: Int, elements: List[Symbol]): List[Symbol] = (count, elements) match {
      case (_, Nil) => Nil
      case (1, head :: tail) => head :: dropRecursive(count + 1, tail)
      case (_, head :: tail) if (count % i == 0) => dropRecursive(count + 1, tail)
      case (_, head :: tail) => head :: dropRecursive(count + 1, tail)
    }
    dropRecursive(1, symbols)
  }
}

assert(P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
println("OK")
