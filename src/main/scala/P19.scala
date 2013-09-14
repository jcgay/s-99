
object P19 {

  def rotate[A](index: Int, elements: List[A]) =  {
    val indexToSplit = if (index < 0) elements.length + index else index
    val split: (List[A], List[A]) = elements.splitAt(indexToSplit)
    split._2 ::: split._1
  }

  def anotherRotate[A](index: Int, elements: List[A]) = {
    val indexToSplit = if (index < 0) elements.length + index else index
    elements.drop(indexToSplit) ::: elements.take(indexToSplit)
  }
}
