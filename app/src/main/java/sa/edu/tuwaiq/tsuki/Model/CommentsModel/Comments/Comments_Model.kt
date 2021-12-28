package sa.edu.tuwaiq.tsuki.Model.CommentsModel.Comments


import com.google.gson.annotations.SerializedName

data class Comments_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)