package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Group_Categories


import com.google.gson.annotations.SerializedName

data class Group_Categories_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksX,
    @SerializedName("meta")
    val meta: Meta
)