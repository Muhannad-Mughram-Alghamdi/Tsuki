package sa.edu.tuwaiq.tsuki.Model.CategoriesModel.CategoriesFavorites


import com.google.gson.annotations.SerializedName

data class Categories_Favorite_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: Meta
)