package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.Mappings


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self")
    val self: String
)