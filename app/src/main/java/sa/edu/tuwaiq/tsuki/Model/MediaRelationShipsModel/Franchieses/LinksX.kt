package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.Franchieses


import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)