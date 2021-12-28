package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Casting


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("featured")
    val featured: Boolean,
    @SerializedName("language")
    val language: Any,
    @SerializedName("role")
    val role: String,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("voiceActor")
    val voiceActor: Boolean
)