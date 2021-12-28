package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.MediaReactions


import com.google.gson.annotations.SerializedName

data class Media_Reactions_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)