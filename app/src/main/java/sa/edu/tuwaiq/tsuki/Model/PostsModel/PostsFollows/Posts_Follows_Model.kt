package sa.edu.tuwaiq.tsuki.Model.PostsModel.PostsFollows


import com.google.gson.annotations.SerializedName

data class Posts_Follows_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)