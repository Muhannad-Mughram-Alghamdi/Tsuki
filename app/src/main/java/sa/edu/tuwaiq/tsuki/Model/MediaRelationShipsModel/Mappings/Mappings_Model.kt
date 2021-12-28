package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.Mappings


import com.google.gson.annotations.SerializedName

data class Mappings_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)