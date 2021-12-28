package sa.edu.tuwaiq.tsuki.Model.UsersModel.LinkedAccounts


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("first")
    val first: String,
    @SerializedName("last")
    val last: String
)