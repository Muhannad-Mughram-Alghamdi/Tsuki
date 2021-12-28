package sa.edu.tuwaiq.tsuki.Model.CharactersModel.Manga_Characters


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("character")
    val character: Character,
    @SerializedName("manga")
    val manga: Manga
)