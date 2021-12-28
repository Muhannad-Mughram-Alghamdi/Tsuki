package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.MediaReactionVotes


import com.google.gson.annotations.SerializedName

data class Media_Reactions_Votes_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)