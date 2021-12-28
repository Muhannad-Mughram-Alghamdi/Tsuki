package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending


import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)