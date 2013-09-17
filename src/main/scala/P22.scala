
object P22 {
  def range(start: Int, end: Int) = start to end

  def rangeRecursive(start: Int, end: Int): List[Int] = {
    if (start > end) Nil
    else start :: rangeRecursive(start + 1, end)
  }
}
