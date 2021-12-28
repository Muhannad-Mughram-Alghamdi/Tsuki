package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Producers


import com.google.gson.annotations.SerializedName

data class LinksXX(
    @SerializedName("first")
    val first: String,
    @SerializedName("last")
    val last: String,
    @SerializedName("next")
    val next: String
)