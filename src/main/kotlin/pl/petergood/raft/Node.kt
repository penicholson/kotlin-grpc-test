package pl.petergood.raft

interface Node {
    fun requestVote(requestVoteMessage: RequestVoteMessage)
    fun appendEntries(appendEntriesMessage: AppendEntriesMessage)
}

private data class RaftNodeState(
    val currentTerm: Int = 0
)

class RaftNode : Node {
    private val state = RaftNodeState()

    override fun requestVote(requestVoteMessage: RequestVoteMessage) {
        TODO("Not yet implemented")
    }

    override fun appendEntries(appendEntriesMessage: AppendEntriesMessage) {
        TODO("Not yet implemented")
    }
}