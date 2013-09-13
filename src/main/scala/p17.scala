
object P17 {

  def split(i: Int, symbols: List[Symbol]) = symbols.splitAt(i)

  def splitRecursive(i: Int, symbols: List[Symbol]): (List[Symbol], List[Symbol]) = (i, symbols) match {
    case (_, Nil) => (Nil, Nil)
    case (0, values) => (List(), values)
    case (_, head :: tail) => {
      val (before, after) = splitRecursive(i - 1, tail)
      (head :: before, after)
    }
  }
}

assert(P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  == (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
println("OK 1")

assert(P17.splitRecursive(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  == (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
println("OK 2")
