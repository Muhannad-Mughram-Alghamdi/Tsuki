package sa.edu.tuwaiq.tsuki.Model.SiteAnnouncementsModel


import com.google.gson.annotations.SerializedName

data class Site_Announcments_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)