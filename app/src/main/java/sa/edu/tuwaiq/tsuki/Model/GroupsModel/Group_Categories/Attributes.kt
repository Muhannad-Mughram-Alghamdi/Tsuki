package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Group_Categories


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("description")
    val description: Any,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("updatedAt")
    val updatedAt: String
)