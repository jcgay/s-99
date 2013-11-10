import arithmetic.S99Int

object P41Spec {

  def main(args: Array[String]) {
    S99Int.printGoldbachList(9 to 20)
    S99Int.printGoldbachListLimited(1 to 2000, 50)
  }
}
