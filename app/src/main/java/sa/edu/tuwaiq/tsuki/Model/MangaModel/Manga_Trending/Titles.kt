package sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga_Trending


import com.google.gson.annotations.SerializedName

data class Titles(
    @SerializedName("en")
    val en: String,
    @SerializedName("en_cn")
    val enCn: String,
    @SerializedName("en_jp")
    val enJp: String,
    @SerializedName("en_kr")
    val enKr: String,
    @SerializedName("en_us")
    val enUs: String,
    @SerializedName("id_id")
    val idId: String,
    @SerializedName("ja_jp")
    val jaJp: String,
    @SerializedName("ko_kr")
    val koKr: String,
    @SerializedName("zh_cn")
    val zhCn: String
)