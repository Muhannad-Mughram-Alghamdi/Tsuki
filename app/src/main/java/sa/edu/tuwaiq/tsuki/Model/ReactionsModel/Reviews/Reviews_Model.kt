package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.Reviews


import com.google.gson.annotations.SerializedName

data class Reviews_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)