package counting.machine.domain

object Error {
  trait Error {
    val errorMessage: String
  }

  case class UnknownPoliticalParty(errorMessage: String) extends Error

}


