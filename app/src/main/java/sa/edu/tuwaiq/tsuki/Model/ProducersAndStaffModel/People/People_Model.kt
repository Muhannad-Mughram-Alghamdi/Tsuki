package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.People


import com.google.gson.annotations.SerializedName

data class People_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: MetaX
)