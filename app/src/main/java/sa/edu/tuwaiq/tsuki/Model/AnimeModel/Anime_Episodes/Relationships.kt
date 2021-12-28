package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Episodes


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("media")
    val media: Media,
    @SerializedName("videos")
    val videos: Videos
)