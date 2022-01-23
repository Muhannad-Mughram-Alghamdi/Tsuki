package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Large(
    @SerializedName("height")
    val height: Int,
    @SerializedName("width")
    val width: Int
): Parcelable