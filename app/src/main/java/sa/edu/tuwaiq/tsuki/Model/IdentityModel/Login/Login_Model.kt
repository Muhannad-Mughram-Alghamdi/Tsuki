package sa.edu.tuwaiq.tsuki.Model.IdentityModel.Login


import com.google.gson.annotations.SerializedName

data class Login_Model(
    @SerializedName("access_token")
    val accessToken: String,
    @SerializedName("created_at")
    val createdAt: Int,
    @SerializedName("expires_in")
    val expiresIn: Int,
    @SerializedName("refresh_token")
    val refreshToken: String,
    @SerializedName("scope")
    val scope: String,
    @SerializedName("token_type")
    val tokenType: String
)