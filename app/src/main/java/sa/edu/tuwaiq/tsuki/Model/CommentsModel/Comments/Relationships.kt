package sa.edu.tuwaiq.tsuki.Model.CommentsModel.Comments


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("likes")
    val likes: Likes,
    @SerializedName("parent")
    val parent: Parent,
    @SerializedName("post")
    val post: Post,
    @SerializedName("replies")
    val replies: Replies,
    @SerializedName("uploads")
    val uploads: Uploads,
    @SerializedName("user")
    val user: User
)