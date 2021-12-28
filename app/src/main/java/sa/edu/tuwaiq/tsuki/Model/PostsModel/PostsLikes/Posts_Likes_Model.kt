package sa.edu.tuwaiq.tsuki.Model.PostsModel.PostsLikes


import com.google.gson.annotations.SerializedName

data class Posts_Likes_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)