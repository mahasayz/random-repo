import org.scalatest.{FunSuite, Matchers}

/**
  * Created by malam on 12/22/16.
  */
class CsvSpec extends FunSuite with Matchers {

  case class Airport(id: Int, ident: String, `type`: String)

  def toCaseClass[A, B](f: B => A)(columns: B): A = {
    f(columns)
  }

  test("Testing csv readability") {
    val url = getClass.getClassLoader.getResource("airports.csv")
    val bufferedSource = io.Source.fromFile(url.getPath)
    for (line <- bufferedSource.getLines().drop(1)) {
      val cols = line.split(",").map(_.trim)

      val res = toCaseClass { columns: Array[String] =>
        Airport(cols(0).toInt, cols(1), cols(2))
      }(cols)
      res
    }
  }

}
