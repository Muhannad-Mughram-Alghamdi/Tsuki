package sa.edu.tuwaiq.tsuki.Model.CharactersModel.Manga_Characters


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: Any,
    @SerializedName("role")
    val role: String,
    @SerializedName("updatedAt")
    val updatedAt: Any
)