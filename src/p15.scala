
object P15 {

  def duplicateN(i: Int, symbols: List[Symbol]) = symbols flatMap { a => List.fill(i)(a) }
}

assert(P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
println("OK")
