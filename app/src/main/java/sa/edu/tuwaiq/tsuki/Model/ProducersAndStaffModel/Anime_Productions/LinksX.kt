package sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Anime_Productions


import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)