import com.lunatech.interviews.model.Country
import com.lunatech.interviews.web.CSVConverter
import com.lunatech.interviews.web.CSVConverter._
import org.scalatest.{FunSuite, Matchers}

import scala.util.Try

/**
  * Created by malam on 12/22/16.
  */
class CsvSpec extends FunSuite with Matchers {

  test("Testing csv readability") {
    val url = getClass.getClassLoader.getResource("countries.csv")
    val bufferedSource = io.Source.fromFile(url.getPath)
    val airports = CSVConverter[List[Country]].from(bufferedSource.getLines().drop(1).mkString("\n"))

    airports.isSuccess shouldEqual(true)
  }

}
