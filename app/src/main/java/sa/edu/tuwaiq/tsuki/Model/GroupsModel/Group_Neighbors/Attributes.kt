package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Group_Neighbors


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("updatedAt")
    val updatedAt: String
)