package sa.edu.tuwaiq.tsuki.Model.UsersModel.Blocks


import com.google.gson.annotations.SerializedName

data class Blocks_Model(
    @SerializedName("data")
    val `data`: List<Any>,
    @SerializedName("links")
    val links: Links,
    @SerializedName("meta")
    val meta: Meta
)