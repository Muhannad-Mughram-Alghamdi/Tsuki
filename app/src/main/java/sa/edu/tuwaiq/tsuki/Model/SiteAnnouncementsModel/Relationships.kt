package sa.edu.tuwaiq.tsuki.Model.SiteAnnouncementsModel


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("user")
    val user: User
)