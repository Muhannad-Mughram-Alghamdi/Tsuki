package sa.edu.tuwaiq.tsuki.Model.CharactersModel.Manga_Characters


import com.google.gson.annotations.SerializedName

data class Manga_Characters_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXXX,
    @SerializedName("meta")
    val meta: Meta
)