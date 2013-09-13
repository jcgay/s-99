
def slice(start: Int, end: Int, symbols: List[Symbol]) = symbols.slice(start, end)

assert(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g))

println("OK")
