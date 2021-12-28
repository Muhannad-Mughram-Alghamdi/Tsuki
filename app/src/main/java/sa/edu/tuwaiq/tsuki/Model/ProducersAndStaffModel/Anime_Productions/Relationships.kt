package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Anime_Productions


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("producer")
    val producer: Producer
)