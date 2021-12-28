package sa.edu.tuwaiq.tsuki.Model.CharactersModel.Anime_Characters


import com.google.gson.annotations.SerializedName

data class Anime_Characters_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)