package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.MediaReactions


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("reaction")
    val reaction: String,
    @SerializedName("upVotesCount")
    val upVotesCount: Int,
    @SerializedName("updatedAt")
    val updatedAt: String
)