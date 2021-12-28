package sa.edu.tuwaiq.tsuki.Model.UsersModel.Follows


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("followed")
    val followed: Followed,
    @SerializedName("follower")
    val follower: Follower
)