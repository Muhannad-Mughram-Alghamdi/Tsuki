package sa.edu.tuwaiq.tsuki.Model.UsersModel.ProfileLinkSites


import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("first")
    val first: String,
    @SerializedName("last")
    val last: String,
    @SerializedName("next")
    val next: String
)