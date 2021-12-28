package sa.edu.tuwaiq.tsuki.Model.CategoriesModel.Categories


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("childCount")
    val childCount: Int,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("nsfw")
    val nsfw: Boolean,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("totalMediaCount")
    val totalMediaCount: Int,
    @SerializedName("updatedAt")
    val updatedAt: String
)