package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.ReviewLikes


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("review")
    val review: Review,
    @SerializedName("user")
    val user: User
)