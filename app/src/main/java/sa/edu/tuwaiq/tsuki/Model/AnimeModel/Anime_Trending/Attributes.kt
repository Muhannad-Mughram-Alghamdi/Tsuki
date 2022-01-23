package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Attributes(
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>,
    @SerializedName("ageRating")
    val ageRating: String,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String,
    @SerializedName("averageRating")
    val averageRating: String,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String,
    @SerializedName("coverImage")
    val coverImage: CoverImage,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("episodeLength")
    val episodeLength: Int,
    @SerializedName("favoritesCount")
    val favoritesCount: Int,
    @SerializedName("nextRelease")
    val nextRelease: String,
    @SerializedName("nsfw")
    val nsfw: Boolean,
    @SerializedName("popularityRank")
    val popularityRank: Int,
    @SerializedName("posterImage")
    val posterImage: PosterImage,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequencies,
    @SerializedName("ratingRank")
    val ratingRank: Int,
    @SerializedName("showType")
    val showType: String,
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
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("totalLength")
    val totalLength: Int,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("userCount")
    val userCount: Int,
    @SerializedName("youtubeVideoId")
    val youtubeVideoId: String
): Parcelable