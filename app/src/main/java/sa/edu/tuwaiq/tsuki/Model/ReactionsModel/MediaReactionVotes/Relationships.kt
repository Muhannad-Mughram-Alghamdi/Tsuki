package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.MediaReactionVotes


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("mediaReaction")
    val mediaReaction: MediaReaction,
    @SerializedName("user")
    val user: User
)