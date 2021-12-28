package sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streamers


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("streamingLinks")
    val streamingLinks: StreamingLinks,
    @SerializedName("videos")
    val videos: Videos
)