import org.junit.Test
import org.junit.Assert._

class P02Test {

  @Test
  def should_get_penultimate() {
    assertEquals(5, P02.penultimate(List(1, 1, 2, 3, 5, 8)))
    assertEquals(5L, P02.penultimate(List(1L, 1L, 2L, 3L, 5L, 8L)))
  }

  @Test
  def should_get_penultimate_recursive() {
    assertEquals(5, P02.penultimateRecursive(List(1, 1, 2, 3, 5, 8)))
  }
}
