package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Episodes


import com.google.gson.annotations.SerializedName

data class Titles(
    @SerializedName("en_jp")
    val enJp: String,
    @SerializedName("en_us")
    val enUs: String,
    @SerializedName("ja_jp")
    val jaJp: String
)