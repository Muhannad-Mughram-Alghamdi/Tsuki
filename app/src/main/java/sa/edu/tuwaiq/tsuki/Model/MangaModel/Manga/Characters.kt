package sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga


import com.google.gson.annotations.SerializedName

data class Characters(
    @SerializedName("links")
    val links: LinksX
)