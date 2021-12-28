package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("animeCharacters")
    val animeCharacters: AnimeCharacters,
    @SerializedName("animeProductions")
    val animeProductions: AnimeProductions,
    @SerializedName("animeStaff")
    val animeStaff: AnimeStaff,
    @SerializedName("castings")
    val castings: Castings,
    @SerializedName("categories")
    val categories: Categories,
    @SerializedName("characters")
    val characters: Characters,
    @SerializedName("episodes")
    val episodes: Episodes,
    @SerializedName("genres")
    val genres: Genres,
    @SerializedName("installments")
    val installments: Installments,
    @SerializedName("mappings")
    val mappings: Mappings,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationships,
    @SerializedName("productions")
    val productions: Productions,
    @SerializedName("quotes")
    val quotes: Quotes,
    @SerializedName("reviews")
    val reviews: Reviews,
    @SerializedName("staff")
    val staff: Staff,
    @SerializedName("streamingLinks")
    val streamingLinks: StreamingLinks
)