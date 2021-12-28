package sa.edu.tuwaiq.tsuki.Model.CommentsModel.Comments


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("blocked")
    val blocked: Boolean,
    @SerializedName("content")
    val content: String,
    @SerializedName("contentFormatted")
    val contentFormatted: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("deletedAt")
    val deletedAt: Any,
    @SerializedName("editedAt")
    val editedAt: Any,
    @SerializedName("embed")
    val embed: Any,
    @SerializedName("embedUrl")
    val embedUrl: Any,
    @SerializedName("likesCount")
    val likesCount: Int,
    @SerializedName("repliesCount")
    val repliesCount: Int,
    @SerializedName("updatedAt")
    val updatedAt: String
)