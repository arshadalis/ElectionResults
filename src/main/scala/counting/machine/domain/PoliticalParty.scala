package counting.machine.domain

object PoliticalParty {

  def fromString(input: String): Either[Error, PoliticalParty] = input.toUpperCase match {
    case "BJP" => Right(BJP)
  }


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

}
