package counting.machine.domain

import counting.machine.domain.Error.UnknownPoliticalParty

object PoliticalParty {

  sealed trait PoliticalParty {
    val name: String
  }

  case object BJP extends PoliticalParty {
    override val name: String = "Bhartiya Janta Party"
  }

  case object INC extends PoliticalParty {
    override val name: String = "Indian National Congress"
  }

  case object BSP extends PoliticalParty {
    override val name: String = "Bahujan Samaj Party"
  }

  case object CPI extends PoliticalParty {
    override val name: String = "Communist Party of India"
  }

  case object NCP extends PoliticalParty {
    override val name: String = "Nationalist Congress Party"
  }

  case object IND extends PoliticalParty {
    override val name: String = "Independant"
  }

  def fromString(input: String) = input.toUpperCase match {
    case "BJP" => Right(BJP)
    case "INC" => Right(INC)
    case "BSP" => Right(BSP)
    case "CPI" => Right(CPI)
    case "NCP" => Right(NCP)
    case "IND" => Right(IND)
    case code => Left(UnknownPoliticalParty(s"Unknown political party code:$code found."))
  }
}
