package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.Reviews


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("content")
    val content: String,
    @SerializedName("contentFormatted")
    val contentFormatted: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("likesCount")
    val likesCount: Int,
    @SerializedName("progress")
    val progress: Any,
    @SerializedName("rating")
    val rating: Double,
    @SerializedName("source")
    val source: String,
    @SerializedName("spoiler")
    val spoiler: Boolean,
    @SerializedName("updatedAt")
    val updatedAt: String
)