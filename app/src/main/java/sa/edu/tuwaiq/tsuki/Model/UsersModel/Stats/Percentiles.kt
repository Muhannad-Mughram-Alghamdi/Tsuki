package sa.edu.tuwaiq.tsuki.Model.UsersModel.Stats


import com.google.gson.annotations.SerializedName

data class Percentiles(
    @SerializedName("media")
    val media: Double,
    @SerializedName("units")
    val units: Double
)