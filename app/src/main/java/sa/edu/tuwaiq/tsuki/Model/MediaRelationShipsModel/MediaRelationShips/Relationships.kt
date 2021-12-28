package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.MediaRelationShips


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("destination")
    val destination: Destination,
    @SerializedName("source")
    val source: Source
)