package counting.machine.domain

import counting.machine.domain.PoliticalParty.{BJP, PoliticalParty}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PoliticalPartySpec extends AnyFlatSpec with Matchers{

  it should "return Political party if input string valid party code" in {

    val politicalparty : Either[Error, PoliticalParty] =  PoliticalParty.fromString("BJP")

    politicalparty shouldEqual Right(BJP)

  }

}
