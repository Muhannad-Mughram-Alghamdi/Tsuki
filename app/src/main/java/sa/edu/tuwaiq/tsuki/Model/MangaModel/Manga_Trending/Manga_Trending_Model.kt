package sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga_Trending


import com.google.gson.annotations.SerializedName

data class Manga_Trending_Model(
    @SerializedName("data")
    val `data`: List<Data>
)