package sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streaming_Links


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Streaming_Links_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
): Parcelable