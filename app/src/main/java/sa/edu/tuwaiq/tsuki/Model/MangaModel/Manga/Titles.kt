package sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga


import com.google.gson.annotations.SerializedName

data class Titles(
    @SerializedName("en")
    val en: Any,
    @SerializedName("en_jp")
    val enJp: String,
    @SerializedName("en_us")
    val enUs: String,
    @SerializedName("ja_jp")
    val jaJp: String
)