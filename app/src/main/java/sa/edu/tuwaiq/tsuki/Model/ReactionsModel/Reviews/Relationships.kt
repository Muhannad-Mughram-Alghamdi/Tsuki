package sa.edu.tuwaiq.tsuki.Model.ReactionsModel.Reviews


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("libraryEntry")
    val libraryEntry: LibraryEntry,
    @SerializedName("media")
    val media: Media,
    @SerializedName("user")
    val user: User
)