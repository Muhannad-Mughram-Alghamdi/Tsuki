package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.Mappings


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: Any,
    @SerializedName("externalId")
    val externalId: String,
    @SerializedName("externalSite")
    val externalSite: String,
    @SerializedName("updatedAt")
    val updatedAt: Any
)