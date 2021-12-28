package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.Franchieses


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("canonicalTitle")
    val canonicalTitle: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("updatedAt")
    val updatedAt: String
)