package sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streaming_Links


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Relationships(
    @SerializedName("media")
    val media: Media,
    @SerializedName("streamer")
    val streamer: Streamer
): Parcelable