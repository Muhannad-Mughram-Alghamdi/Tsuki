package sa.edu.tuwaiq.tsuki.Model.UsersModel.ProfileLinkSites


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("type")
    val type: String
)