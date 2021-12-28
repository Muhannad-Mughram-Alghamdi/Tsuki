package sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime


import com.google.gson.annotations.SerializedName

data class Characters(
    @SerializedName("links")
    val links: Links
)