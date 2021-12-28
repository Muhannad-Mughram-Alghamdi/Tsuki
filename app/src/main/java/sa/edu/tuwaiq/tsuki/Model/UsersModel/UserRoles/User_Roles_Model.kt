package sa.edu.tuwaiq.tsuki.Model.UsersModel.UserRoles


import com.google.gson.annotations.SerializedName

data class User_Roles_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXXX,
    @SerializedName("meta")
    val meta: Meta
)