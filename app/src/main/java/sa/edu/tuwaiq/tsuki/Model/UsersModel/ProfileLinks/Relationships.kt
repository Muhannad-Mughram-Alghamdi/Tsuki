package sa.edu.tuwaiq.tsuki.Model.UsersModel.ProfileLinks


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("profileLinkSite")
    val profileLinkSite: ProfileLinkSite,
    @SerializedName("user")
    val user: User
)