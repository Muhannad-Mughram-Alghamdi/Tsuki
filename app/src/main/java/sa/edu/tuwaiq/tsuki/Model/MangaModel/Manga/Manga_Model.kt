package sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga


import com.google.gson.annotations.SerializedName

data class Manga_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: MetaX
)