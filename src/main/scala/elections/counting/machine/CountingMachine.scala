package elections.counting.machine

import elections.domain.{ConstituencyVoteShare, ElectionResult}

trait CountingMachine {
  def findWiningParty(constituencyVoteShare: ConstituencyVoteShare): Either[Error, ElectionResult]
}
