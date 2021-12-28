package sa.edu.tuwaiq.tsuki.Model.CategoriesModel.Categories


import com.google.gson.annotations.SerializedName

data class Catagories_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)