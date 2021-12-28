package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Groups


import com.google.gson.annotations.SerializedName

data class Neighbors(
    @SerializedName("links")
    val links: LinksX
)