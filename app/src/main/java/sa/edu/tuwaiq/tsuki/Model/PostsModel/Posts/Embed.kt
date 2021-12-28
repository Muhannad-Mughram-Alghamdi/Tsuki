package sa.edu.tuwaiq.tsuki.Model.PostsModel.Posts


import com.google.gson.annotations.SerializedName

data class Embed(
    @SerializedName("image")
    val image: Image,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String
)