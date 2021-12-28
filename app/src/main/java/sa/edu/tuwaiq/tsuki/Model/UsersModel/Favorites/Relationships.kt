package sa.edu.tuwaiq.tsuki.Model.UsersModel.Favorites


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("item")
    val item: Item,
    @SerializedName("user")
    val user: User
)