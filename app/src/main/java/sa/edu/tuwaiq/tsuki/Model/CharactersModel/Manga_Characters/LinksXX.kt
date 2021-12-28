package sa.edu.tuwaiq.tsuki.Model.CharactersModel.Manga_Characters


import com.google.gson.annotations.SerializedName

data class LinksXX(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)