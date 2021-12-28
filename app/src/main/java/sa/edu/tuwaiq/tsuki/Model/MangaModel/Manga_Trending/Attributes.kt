package sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga_Trending


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>,
    @SerializedName("ageRating")
    val ageRating: String,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: Any,
    @SerializedName("averageRating")
    val averageRating: String,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String,
    @SerializedName("chapterCount")
    val chapterCount: Any,
    @SerializedName("coverImage")
    val coverImage: Any,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("endDate")
    val endDate: Any,
    @SerializedName("favoritesCount")
    val favoritesCount: Int,
    @SerializedName("mangaType")
    val mangaType: String,
    @SerializedName("nextRelease")
    val nextRelease: Any,
    @SerializedName("popularityRank")
    val popularityRank: Int,
    @SerializedName("posterImage")
    val posterImage: PosterImage,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequencies,
    @SerializedName("ratingRank")
    val ratingRank: Int,
    @SerializedName("serialization")
    val serialization: Any,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("startDate")
    val startDate: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("subtype")
    val subtype: String,
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("tba")
    val tba: Any,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("userCount")
    val userCount: Int,
    @SerializedName("volumeCount")
    val volumeCount: Any
)