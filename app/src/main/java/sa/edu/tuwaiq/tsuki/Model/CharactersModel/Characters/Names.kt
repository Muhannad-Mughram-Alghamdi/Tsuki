package sa.edu.tuwaiq.tsuki.Model.CharactersModel.Characters


import com.google.gson.annotations.SerializedName

data class Names(
    @SerializedName("en")
    val en: String,
    @SerializedName("ja_jp")
    val jaJp: String
)