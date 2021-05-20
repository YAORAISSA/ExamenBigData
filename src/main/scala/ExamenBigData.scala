object ExamenBigData {

  def main(args: Array[String]): Unit = {

    val raissa = List("julien","paul", "jean","rac", "trec", "joel", "ed", "chris", "maurice")

    println(monexam(raissa))

  }

  def monexam(k: List[String]): List[String] = {
    val k1 = k.filter(s => (s.charAt(s.length-1) == 'n'))
    return k1
  }

  def liste_double(): Unit = {

  }

  val montableau : Array[String][String] = Array("ecommercemag.fr","joel")
  montableau(0) = "bety"

  def main(args: Array[String]) {
    var myMatrix = ofDim[Int](3,3)

}
