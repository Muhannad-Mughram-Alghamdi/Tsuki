package sa.edu.tuwaiq.tsuki.Model.CategoriesModel.CategoriesFavorites


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("category")
    val category: Category,
    @SerializedName("user")
    val user: User
)