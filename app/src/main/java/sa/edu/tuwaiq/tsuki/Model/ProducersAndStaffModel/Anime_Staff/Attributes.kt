package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Anime_Staff


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: Any,
    @SerializedName("role")
    val role: String,
    @SerializedName("updatedAt")
    val updatedAt: Any
)