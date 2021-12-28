package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Group_Members


import com.google.gson.annotations.SerializedName

data class Group_members_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)