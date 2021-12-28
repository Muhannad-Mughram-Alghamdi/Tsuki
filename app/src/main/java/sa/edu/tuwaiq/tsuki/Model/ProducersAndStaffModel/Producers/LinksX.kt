package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Producers


import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)