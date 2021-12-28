package sa.edu.tuwaiq.tsuki.Model.UsersModel.Roles


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("resource")
    val resource: Resource,
    @SerializedName("userRoles")
    val userRoles: UserRoles
)