package sa.edu.tuwaiq.tsuki.Model.UsersModel.UserRoles


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("role")
    val role: Role,
    @SerializedName("user")
    val user: User
)