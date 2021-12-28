package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Anime_Productions


import com.google.gson.annotations.SerializedName

data class Anime_Productions_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)