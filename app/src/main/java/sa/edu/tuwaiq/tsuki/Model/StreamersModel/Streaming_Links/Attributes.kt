package sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streaming_Links


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Attributes(
    @SerializedName("dubs")
    val dubs: List<String>,
    @SerializedName("subs")
    val subs: List<String>,
    @SerializedName("url")
    val url: String
): Parcelable