package sa.edu.tuwaiq.tsuki.Model.CharactersModel.Anime_Characters


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("castings")
    val castings: Castings,
    @SerializedName("character")
    val character: Character
)