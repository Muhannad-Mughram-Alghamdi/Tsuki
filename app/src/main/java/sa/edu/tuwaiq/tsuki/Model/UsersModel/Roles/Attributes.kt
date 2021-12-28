package sa.edu.tuwaiq.tsuki.Model.UsersModel.Roles


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("resourceId")
    val resourceId: Any,
    @SerializedName("resourceType")
    val resourceType: Any,
    @SerializedName("updatedAt")
    val updatedAt: String
)