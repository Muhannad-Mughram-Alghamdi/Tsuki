package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Group_Neighbors


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("destination")
    val destination: Destination,
    @SerializedName("source")
    val source: Source
)