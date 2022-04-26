package counting.machine.domain

import counting.machine.domain.Error.UnknownPoliticalParty
import counting.machine.domain.PoliticalParty._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PoliticalPartySpec extends AnyFlatSpec with Matchers{

  val extractPoliticalPartyFromString = PoliticalParty.fromString _

  it should "return Political party if input string is valid party code" in {
    extractPoliticalPartyFromString("BJP") shouldEqual Right(BJP)
    extractPoliticalPartyFromString("INC") shouldEqual Right(INC)
    extractPoliticalPartyFromString("BSP") shouldEqual Right(BSP)
    extractPoliticalPartyFromString("CPI") shouldEqual Right(CPI)
    extractPoliticalPartyFromString("NCP") shouldEqual Right(NCP)
    extractPoliticalPartyFromString("IND") shouldEqual Right(IND)

  }

  it should "return Political party even if input string is lowercase valid party code" in {
    extractPoliticalPartyFromString("bjp") shouldEqual Right(BJP)
    extractPoliticalPartyFromString("inc") shouldEqual Right(INC)
    extractPoliticalPartyFromString("bsp") shouldEqual Right(BSP)
    extractPoliticalPartyFromString("cpi") shouldEqual Right(CPI)
    extractPoliticalPartyFromString("ncp") shouldEqual Right(NCP)
    extractPoliticalPartyFromString("ind") shouldEqual Right(IND)

  }

  it should "return UnknownPoliticalParty error if input string is not valid party code" in {
    extractPoliticalPartyFromString("BAC") shouldEqual Left(UnknownPoliticalParty("Unknown political party code:BAC found."))
  }

}
