package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Episodes


import com.google.gson.annotations.SerializedName

data class LinksXX(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)