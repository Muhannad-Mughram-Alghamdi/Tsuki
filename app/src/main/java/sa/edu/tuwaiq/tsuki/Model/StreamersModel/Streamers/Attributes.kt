package sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streamers


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: Any,
    @SerializedName("siteName")
    val siteName: String,
    @SerializedName("streamingLinksCount")
    val streamingLinksCount: Int,
    @SerializedName("updatedAt")
    val updatedAt: Any
)