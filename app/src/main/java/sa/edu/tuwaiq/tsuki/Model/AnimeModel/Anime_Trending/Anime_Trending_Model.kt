package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending


import com.google.gson.annotations.SerializedName

data class Anime_Trending_Model(
    @SerializedName("data")
    val `data`: List<Data>
)