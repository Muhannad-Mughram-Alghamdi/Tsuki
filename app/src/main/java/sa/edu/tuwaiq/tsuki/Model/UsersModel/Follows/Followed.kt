package sa.edu.tuwaiq.tsuki.Model.UsersModel.Follows


import com.google.gson.annotations.SerializedName

data class Followed(
    @SerializedName("links")
    val links: LinksX
)