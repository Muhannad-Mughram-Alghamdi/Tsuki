package sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streaming_Links


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("media")
    val media: Media,
    @SerializedName("streamer")
    val streamer: Streamer
)