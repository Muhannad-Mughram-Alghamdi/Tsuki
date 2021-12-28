package sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streaming_Links


import com.google.gson.annotations.SerializedName

data class Streaming_Links_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)