package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.MediaReactions


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("drama")
    val drama: Drama,
    @SerializedName("libraryEntry")
    val libraryEntry: LibraryEntry,
    @SerializedName("manga")
    val manga: Manga,
    @SerializedName("user")
    val user: User,
    @SerializedName("votes")
    val votes: Votes
)