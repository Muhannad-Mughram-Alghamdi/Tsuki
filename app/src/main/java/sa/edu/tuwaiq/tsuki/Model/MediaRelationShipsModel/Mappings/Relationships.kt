package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.Mappings


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("item")
    val item: Item
)