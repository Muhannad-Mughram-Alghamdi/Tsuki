package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.ReviewLikes


import com.google.gson.annotations.SerializedName

data class Review_Likes_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)