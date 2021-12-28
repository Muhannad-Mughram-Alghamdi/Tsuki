package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime


import com.google.gson.annotations.SerializedName

data class Anime_Model(             //the response
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksX,
    @SerializedName("meta")
    val meta: MetaX
)