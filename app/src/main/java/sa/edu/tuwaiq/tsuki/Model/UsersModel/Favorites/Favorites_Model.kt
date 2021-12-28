package sa.edu.tuwaiq.tsuki.Model.UsersModel.Favorites


import com.google.gson.annotations.SerializedName

data class Favorites_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXXX,
    @SerializedName("meta")
    val meta: Meta
)