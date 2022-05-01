package elections.domain

import elections.domain.PoliticalParty.PoliticalParty
import elections.domain.machine.domain.VoteShare

case class ElectionResult(constituency: Constituency, winningParty: PoliticalParty, voteShare: VoteShare)
