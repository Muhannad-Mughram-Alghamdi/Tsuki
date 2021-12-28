package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.Reviews


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("relationships")
    val relationships: Relationships,
    @SerializedName("type")
    val type: String
)