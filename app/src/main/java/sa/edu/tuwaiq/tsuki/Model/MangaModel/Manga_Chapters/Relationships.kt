package sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga_Chapters


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("manga")
    val manga: Manga
)