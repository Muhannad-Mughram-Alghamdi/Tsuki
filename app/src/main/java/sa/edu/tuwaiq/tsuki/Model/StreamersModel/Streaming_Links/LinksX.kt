package sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streaming_Links


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LinksX(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
): Parcelable