package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Producers


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("animeProductions")
    val animeProductions: AnimeProductions,
    @SerializedName("productions")
    val productions: Productions
)