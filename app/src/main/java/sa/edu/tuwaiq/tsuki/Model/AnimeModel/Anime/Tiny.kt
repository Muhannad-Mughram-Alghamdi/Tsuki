package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime


import com.google.gson.annotations.SerializedName

data class Tiny(
    @SerializedName("height")
    val height: Int,
    @SerializedName("width")
    val width: Int
)