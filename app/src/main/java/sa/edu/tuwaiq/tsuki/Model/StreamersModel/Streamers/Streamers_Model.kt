package sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streamers


import com.google.gson.annotations.SerializedName

data class Streamers_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)