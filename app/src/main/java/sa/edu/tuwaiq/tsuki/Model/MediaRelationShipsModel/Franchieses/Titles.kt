package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.Franchieses


import com.google.gson.annotations.SerializedName

data class Titles(
    @SerializedName("en")
    val en: String,
    @SerializedName("en_jp")
    val enJp: String
)