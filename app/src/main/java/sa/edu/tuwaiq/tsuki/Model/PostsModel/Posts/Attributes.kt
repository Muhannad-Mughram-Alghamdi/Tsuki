package sa.edu.tuwaiq.tsuki.Model.PostsModel.Posts


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("blocked")
    val blocked: Boolean,
    @SerializedName("commentsCount")
    val commentsCount: Int,
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
    val embed: Embed,
    @SerializedName("embedUrl")
    val embedUrl: Any,
    @SerializedName("lockedAt")
    val lockedAt: Any,
    @SerializedName("lockedReason")
    val lockedReason: Any,
    @SerializedName("nsfw")
    val nsfw: Boolean,
    @SerializedName("postLikesCount")
    val postLikesCount: Int,
    @SerializedName("spoiler")
    val spoiler: Boolean,
    @SerializedName("targetInterest")
    val targetInterest: Any,
    @SerializedName("topLevelCommentsCount")
    val topLevelCommentsCount: Int,
    @SerializedName("updatedAt")
    val updatedAt: String
)