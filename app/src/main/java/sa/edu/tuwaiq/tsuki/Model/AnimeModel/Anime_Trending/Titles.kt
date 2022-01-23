package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Titles(
    @SerializedName("en")
    val en: String,
    @SerializedName("en_jp")
    val enJp: String,
    @SerializedName("en_us")
    val enUs: String,
    @SerializedName("ja_jp")
    val jaJp: String
): Parcelable