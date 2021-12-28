package sa.edu.tuwaiq.tsuki.Model.CommentsModel.Comments_Likes


import com.google.gson.annotations.SerializedName

data class Comments_Likes_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)