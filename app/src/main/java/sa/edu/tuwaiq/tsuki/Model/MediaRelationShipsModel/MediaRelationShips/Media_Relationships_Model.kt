package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.MediaRelationShips


import com.google.gson.annotations.SerializedName

data class Media_Relationships_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXXX,
    @SerializedName("meta")
    val meta: Meta
)