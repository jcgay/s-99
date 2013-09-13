import org.junit.Test
import org.junit.Assert._

class P01Test {

  @Test
  def should_get_last_element() {
    assertEquals(8, P01.last(List(1, 1, 2, 3, 5, 8)))
    assertEquals(8L, P01.last(List(1L, 1L, 2L, 3L, 5L, 8L)))
  }

  @Test
  def should_get_last_element_recursive() {
    assertEquals(8, P01.recursiveLast(List(1, 1, 2, 3, 5, 8)))
    assertEquals(8L, P01.recursiveLast(List(1L, 1L, 2L, 3L, 5L, 8L)))
  }
}
