import scala.util.Random

object P24 {
  def lotto(size: Int, max: Int):List[Int] = {
    if (size <= 0) Nil
    else new Random().nextInt(max) :: lotto(size - 1, max)
  }
}
