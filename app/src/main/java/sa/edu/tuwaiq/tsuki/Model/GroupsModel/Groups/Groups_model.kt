package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Groups


import com.google.gson.annotations.SerializedName

data class Groups_model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: MetaXX
)