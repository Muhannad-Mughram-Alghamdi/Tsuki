package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CoverImage(
    @SerializedName("large")
    val large: String,
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("original")
    val original: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("tiny")
    val tiny: String
): Parcelable