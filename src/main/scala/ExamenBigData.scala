object ExamenBigData {

  def main(args: Array[String]): Unit = {

    val raissa = List("francklin","hiram", "ilan","karinesse")

    println(monexam(raissa))

  }

  def monexam(k: List[String]): List[String] = {
    val k1 = k.filter(s => (s.charAt(s.length-1) == 'n'))
    return k1
  }


}
