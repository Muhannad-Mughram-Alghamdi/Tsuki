package sa.edu.tuwaiq.tsuki.Model.UsersModel.Favorites


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("favRank")
    val favRank: Int,
    @SerializedName("updatedAt")
    val updatedAt: String
)