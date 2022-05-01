package counting.machine.domain

import counting.machine.domain.Errors.InvalidConstituencyName
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ConstituencySpec extends AnyFlatSpec with Matchers {

  it should "return Constituency if input is valid string" in {

    Constituency.fromString("Banglore") shouldEqual Right(Constituency("Banglore"))
    Constituency.fromString("Pune") shouldEqual Right(Constituency("Pune"))
    Constituency.fromString("jaipur") shouldEqual Right(Constituency("jaipur"))

  }

  it should "return Error if input is not valid string" in {
    Constituency.fromString("") shouldEqual Left(InvalidConstituencyName("Invalid Constituency name provided:. Constituency name should be alphabets only."))
    Constituency.fromString("1234Pune") shouldEqual Left(InvalidConstituencyName("Invalid Constituency name provided:1234Pune. Constituency name should be alphabets only."))
    Constituency.fromString("Pune7") shouldEqual Left(InvalidConstituencyName("Invalid Constituency name provided:Pune7. Constituency name should be alphabets only."))
    Constituency.fromString("Pu12ne") shouldEqual Left(InvalidConstituencyName("Invalid Constituency name provided:Pu12ne. Constituency name should be alphabets only."))
    Constituency.fromString("123") shouldEqual Left(InvalidConstituencyName("Invalid Constituency name provided:123. Constituency name should be alphabets only."))

  }

}
