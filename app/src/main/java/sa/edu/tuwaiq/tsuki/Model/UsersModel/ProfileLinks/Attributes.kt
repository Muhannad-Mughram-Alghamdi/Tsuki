package sa.edu.tuwaiq.tsuki.Model.UsersModel.ProfileLinks


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: Any,
    @SerializedName("updatedAt")
    val updatedAt: Any,
    @SerializedName("url")
    val url: String
)