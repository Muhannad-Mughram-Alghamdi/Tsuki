package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.MediaRelationShips


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: Any,
    @SerializedName("role")
    val role: String,
    @SerializedName("updatedAt")
    val updatedAt: Any
)