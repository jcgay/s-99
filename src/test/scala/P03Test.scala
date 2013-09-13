import org.junit.Test
import org.junit.Assert._

class P03Test {

  @Test
  def should_get_element_by_its_index() {
    assertEquals(2, P03.nth(2, List(1, 1, 2, 3, 5, 8)))
  }

  @Test
  def should_get_element_by_its_index_recursive() {
    assertEquals(2, P03.nthRecursive(2, List(1, 1, 2, 3, 5, 8)))
  }
}
