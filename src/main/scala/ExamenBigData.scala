object ExamenBigData {

  def main(args: Array[String]): Unit = {

    val raissa = List("julien","paul", "jean","rac", "trec", "joel", "ed", "chris", "maurice")

    println(monexam(raissa))
    liste_double()


  }

  def monexam(k: List[String]): List[String] = {
    val k1 = k.filter(s => (s.charAt(s.length-1) == 'n'))
    return k1
  }

  def liste_double(): Unit = {
    val  Montableau = List(List("ecommercemag.fr"," "),List("https://www.journalducm.com/contact/","Payant"),
      List("https://www.zatsaz.com/",""),List("https://www.lerevenu.com/",""),
      List("https://www.cadre-dirigfdeant-magazine.com/","payant"),
      List("https://www.silicon.fr/services/contact#annoncer","Payant"),
      List("https://www.channelbiz.fr/nous-contacter/",""),
      List("https://www.itespresso.fr/",""),
      List("https://www.industrie-mag.com/article4.html","invite"),
      List("https://www.jesuisundev.com/article-invite/","invite"),
      List("https://www.numerama.com/",""))
    Montableau.foreach(t=>{println(t(0)+" "+t(1))})

  }




}
