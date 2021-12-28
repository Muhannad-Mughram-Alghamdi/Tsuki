package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Groups


import com.google.gson.annotations.SerializedName

data class DimensionsX(
    @SerializedName("large")
    val large: Large,
    @SerializedName("small")
    val small: Small,
    @SerializedName("tiny")
    val tiny: Tiny
)