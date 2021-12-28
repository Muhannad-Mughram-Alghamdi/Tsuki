package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Casting


import com.google.gson.annotations.SerializedName

data class Casting_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)