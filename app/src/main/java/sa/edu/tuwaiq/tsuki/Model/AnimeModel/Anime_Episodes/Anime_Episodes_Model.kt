package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Episodes


import com.google.gson.annotations.SerializedName

data class Anime_Episodes_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXXX,
    @SerializedName("meta")
    val meta: Meta
)