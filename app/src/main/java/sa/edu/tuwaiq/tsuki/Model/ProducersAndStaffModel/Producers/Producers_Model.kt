package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Producers


import com.google.gson.annotations.SerializedName

data class Producers_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)