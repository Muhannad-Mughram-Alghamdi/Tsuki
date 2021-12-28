package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.People


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("castings")
    val castings: Castings,
    @SerializedName("staff")
    val staff: Staff,
    @SerializedName("voices")
    val voices: Voices
)