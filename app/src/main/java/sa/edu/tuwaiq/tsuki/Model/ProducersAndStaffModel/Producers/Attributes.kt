package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Producers


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("updatedAt")
    val updatedAt: String
)