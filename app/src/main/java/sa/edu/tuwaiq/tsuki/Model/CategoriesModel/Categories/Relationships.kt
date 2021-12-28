package sa.edu.tuwaiq.tsuki.Model.CategoriesModel.Categories


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("drama")
    val drama: Drama,
    @SerializedName("manga")
    val manga: Manga,
    @SerializedName("parent")
    val parent: Parent
)