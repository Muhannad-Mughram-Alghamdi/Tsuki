package sa.edu.tuwaiq.tsuki.Model.UsersModel.ProfileLinks


import com.google.gson.annotations.SerializedName

data class Profile_Links_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXXX,
    @SerializedName("meta")
    val meta: Meta
)