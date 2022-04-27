package counting.machine.domain

import counting.machine.domain.Errors.{Error, InvalidConstituencyName}

case class Constituency(name:String)

object Constituency{
  val constituencyPattern  = "^[a-zA-Z]+$"

  def fromString(input: String) : Either[Error, Constituency] =
    if(input.matches(constituencyPattern)) Right(Constituency(input))
    else Left(InvalidConstituencyName(s"Invalid Constituency name provided:$input. Constituency name should pure Characters."))
}