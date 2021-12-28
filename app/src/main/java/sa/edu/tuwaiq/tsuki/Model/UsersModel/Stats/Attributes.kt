package sa.edu.tuwaiq.tsuki.Model.UsersModel.Stats


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("statsData")
    val statsData: StatsData,
    @SerializedName("updatedAt")
    val updatedAt: String
)