package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Group_Members


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("rank")
    val rank: String,
    @SerializedName("unreadCount")
    val unreadCount: Int,
    @SerializedName("updatedAt")
    val updatedAt: String
)