package sa.edu.tuwaiq.tsuki.Model.PostsModel.Posts


import com.google.gson.annotations.SerializedName

data class Posts_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)