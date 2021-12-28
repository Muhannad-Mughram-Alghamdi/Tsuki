package sa.edu.tuwaiq.tsuki.Model.CharactersModel.Characters


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("castings")
    val castings: Castings,
    @SerializedName("mediaCharacters")
    val mediaCharacters: MediaCharacters,
    @SerializedName("primaryMedia")
    val primaryMedia: PrimaryMedia,
    @SerializedName("quotes")
    val quotes: Quotes
)