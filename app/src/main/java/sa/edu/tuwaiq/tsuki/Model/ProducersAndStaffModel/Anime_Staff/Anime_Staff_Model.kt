package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Anime_Staff


import com.google.gson.annotations.SerializedName

data class Anime_Staff_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)