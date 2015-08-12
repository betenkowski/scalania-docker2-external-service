package scalania.docker2

import scalaj.http.Http

object Main extends App {
  val url = "http://localhost:8080"
  val city = args(0)
  val response = Http(url).param("city", city).asString

  println(response.code)
  println(response.body)
}
