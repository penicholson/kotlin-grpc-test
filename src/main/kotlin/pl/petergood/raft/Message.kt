package pl.petergood.raft

sealed class Message

data class RequestVoteMessage(
    val term: Int,
    val candidateId: Int
) : Message()

data class AppendEntriesMessage(
    val term: Int
) : Message()