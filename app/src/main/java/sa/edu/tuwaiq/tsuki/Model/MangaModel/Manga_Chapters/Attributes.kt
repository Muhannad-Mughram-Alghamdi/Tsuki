package sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga_Chapters


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("canonicalTitle")
    val canonicalTitle: Any,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("length")
    val length: Any,
    @SerializedName("number")
    val number: Int,
    @SerializedName("published")
    val published: Any,
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("thumbnail")
    val thumbnail: Any,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("volumeNumber")
    val volumeNumber: Int
)