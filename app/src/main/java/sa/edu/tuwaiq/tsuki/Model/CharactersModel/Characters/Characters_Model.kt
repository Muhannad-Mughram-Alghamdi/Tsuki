package sa.edu.tuwaiq.tsuki.Model.CharactersModel.Characters


import com.google.gson.annotations.SerializedName

data class Characters_Model(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: LinksXX,
    @SerializedName("meta")
    val meta: MetaX
)