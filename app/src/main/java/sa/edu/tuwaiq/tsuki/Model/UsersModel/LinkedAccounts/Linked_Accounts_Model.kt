package sa.edu.tuwaiq.tsuki.Model.UsersModel.LinkedAccounts


import com.google.gson.annotations.SerializedName

data class Linked_Accounts_Model(
    @SerializedName("data")
    val `data`: List<Any>,
    @SerializedName("links")
    val links: Links,
    @SerializedName("meta")
    val meta: Meta
)