package sa.edu.tuwaiq.tsuki.Model.CommentsModel.Comments_Likes


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("comment")
    val comment: Comment,
    @SerializedName("user")
    val user: User
)