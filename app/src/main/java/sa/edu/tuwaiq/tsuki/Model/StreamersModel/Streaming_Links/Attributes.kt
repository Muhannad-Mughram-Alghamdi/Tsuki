package sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streaming_Links


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: Any,
    @SerializedName("dubs")
    val dubs: List<String>,
    @SerializedName("subs")
    val subs: List<String>,
    @SerializedName("updatedAt")
    val updatedAt: Any,
    @SerializedName("url")
    val url: String
)