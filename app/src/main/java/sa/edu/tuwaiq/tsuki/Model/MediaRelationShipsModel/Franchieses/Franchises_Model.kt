package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.Franchieses


import com.google.gson.annotations.SerializedName

data class Franchises_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)