package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Episodes


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("airdate")
    val airdate: Any,
    @SerializedName("canonicalTitle")
    val canonicalTitle: Any,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("description")
    val description: Any,
    @SerializedName("length")
    val length: Int,
    @SerializedName("number")
    val number: Int,
    @SerializedName("relativeNumber")
    val relativeNumber: Int,
    @SerializedName("seasonNumber")
    val seasonNumber: Any,
    @SerializedName("synopsis")
    val synopsis: Any,
    @SerializedName("thumbnail")
    val thumbnail: Any,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("updatedAt")
    val updatedAt: String
)