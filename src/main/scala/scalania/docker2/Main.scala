package scalania.docker2

import scalaj.http.Http
import scalikejdbc._
import scalikejdbc.config.DBs

object Main extends App {
  DBs.setupAll()

  val url = "http://localhost:8080"
  val city = args(0)
  val response = Http(url).param("city", city).asString

  DB.localTx { implicit session =>
    sql"INSERT INTO request_log(param, response_code) VALUES ($city, ${response.code})".execute().apply()
  }

  println(response.code)
  println(response.body)
}
