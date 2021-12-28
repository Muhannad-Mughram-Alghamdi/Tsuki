package sa.edu.tuwaiq.tsuki.Model.UsersModel.ProfileLinkSites


import com.google.gson.annotations.SerializedName

data class Profile_Link_Sites_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksX,
    @SerializedName("meta")
    val meta: Meta
)