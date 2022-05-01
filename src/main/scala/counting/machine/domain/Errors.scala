package counting.machine.domain

object Errors {


  sealed trait Error {
    val errorMessage: String
  }

  case class UnknownPoliticalParty(errorMessage: String) extends Error
  case class InvalidPoliticalParty(errorMessage: String) extends Error

  case class InvalidConstituencyName(errorMessage: String) extends Error

}


