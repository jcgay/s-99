
def duplicate(symbols: List[Symbol]) = symbols flatMap { a => List.fill(2)(a) }

assert(duplicate(List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))

println("OK")
