package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Casting


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("character")
    val character: Character,
    @SerializedName("media")
    val media: Media,
    @SerializedName("person")
    val person: Person
)