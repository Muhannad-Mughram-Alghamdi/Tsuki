package sa.edu.tuwaiq.tsuki.Model.UsersModel.Users


import com.google.gson.annotations.SerializedName

data class LinksXXX(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)