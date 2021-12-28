package sa.edu.tuwaiq.tsuki.Model.CharactersModel.Characters


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("canonicalName")
    val canonicalName: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("image")
    val image: Image,
    @SerializedName("malId")
    val malId: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("names")
    val names: Names,
    @SerializedName("otherNames")
    val otherNames: List<String>,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("updatedAt")
    val updatedAt: String
)