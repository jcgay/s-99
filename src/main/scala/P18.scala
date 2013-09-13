
object P18 {

  def slice[A](start: Int, end: Int, elements: List[A]) = elements.slice(start, end)

  def sliceRecursive[A](start: Int, end: Int, elements: List[A]) = {
    def slicer(count:Int, values: List[A]): List[A] = {
      if (count >= start && count < end) values.head :: slicer(count + 1, values.tail)
      else if (count == end) Nil
      else slicer(count + 1, values.tail)
    }
    slicer(0, elements)
  }
}
