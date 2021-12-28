package sa.edu.tuwaiq.tsuki.Model.PostsModel.PostsFollows


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("post")
    val post: Post,
    @SerializedName("user")
    val user: User
)