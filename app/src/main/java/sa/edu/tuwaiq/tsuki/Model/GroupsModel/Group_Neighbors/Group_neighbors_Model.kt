package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Group_Neighbors


import com.google.gson.annotations.SerializedName

data class Group_neighbors_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)