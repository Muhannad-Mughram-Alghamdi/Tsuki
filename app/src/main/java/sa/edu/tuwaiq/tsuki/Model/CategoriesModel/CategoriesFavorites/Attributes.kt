package sa.edu.tuwaiq.tsuki.Model.CategoriesModel.CategoriesFavorites


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("updatedAt")
    val updatedAt: String
)