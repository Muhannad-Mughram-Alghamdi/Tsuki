package sa.edu.tuwaiq.tsuki.Model.IdentityModel.Login


import com.google.gson.annotations.SerializedName

data class Login_Body(
    @SerializedName("grant_type")
    val grantType: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("username")
    val username: String
)