package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Group_Permissions


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("permission")
    val permission: String,
    @SerializedName("updatedAt")
    val updatedAt: String
)