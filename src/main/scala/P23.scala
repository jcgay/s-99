import java.util
import scala.util.Random

object P23 {

  def randomSelect[A](size: Int, elements: List[A]): List[A] = {
    if (size <= 0) Nil
    else {
      val removed: (List[A], A) = P20.removeAt(new util.Random().nextInt(elements.length), elements)
      removed._2 :: randomSelect(size - 1, removed._1)
    }
  }
}
