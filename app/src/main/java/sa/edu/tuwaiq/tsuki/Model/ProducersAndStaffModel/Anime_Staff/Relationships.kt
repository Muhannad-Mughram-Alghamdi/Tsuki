package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Anime_Staff


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("person")
    val person: Person
)