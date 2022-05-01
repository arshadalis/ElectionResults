package elections.domain

sealed trait Error {
  val errorMessage: String
}


object Error {

  case class UnknownPoliticalParty(errorMessage: String) extends Error
  case class InvalidPoliticalParty(errorMessage: String) extends Error

  case class InvalidConstituencyName(errorMessage: String) extends Error

}


