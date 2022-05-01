package elections.domain

import elections.domain.PoliticalParty.PoliticalParty
import elections.domain.machine.domain.Votes

case class PartyVoteShare(party: PoliticalParty, votes: Votes)
