
def decode(encoded: List[(Int, Symbol)]) = encoded flatMap { a => List.fill(a._1)(a._2) }

assert(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

println("OK")