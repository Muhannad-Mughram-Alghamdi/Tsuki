package sa.edu.tuwaiq.tsuki.Model.UsersModel.Stats


import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("Action")
    val action: Int,
    @SerializedName("Adventure")
    val adventure: Int,
    @SerializedName("Angst")
    val angst: Int,
    @SerializedName("Anthropomorphism")
    val anthropomorphism: Int,
    @SerializedName("Blackmail")
    val blackmail: Int,
    @SerializedName("Comedy")
    val comedy: Int,
    @SerializedName("Detective")
    val detective: Int,
    @SerializedName("Drama")
    val drama: Int,
    @SerializedName("Ecchi")
    val ecchi: Int,
    @SerializedName("Fantasy")
    val fantasy: Int,
    @SerializedName("Ghost")
    val ghost: Int,
    @SerializedName("Harem")
    val harem: Int,
    @SerializedName("Henshin")
    val henshin: Int,
    @SerializedName("Horror")
    val horror: Int,
    @SerializedName("Incest")
    val incest: Int,
    @SerializedName("Magical Girl")
    val magicalGirl: Int,
    @SerializedName("Mystery")
    val mystery: Int,
    @SerializedName("Parasite")
    val parasite: Int,
    @SerializedName("Psychological")
    val psychological: Int,
    @SerializedName("Romance")
    val romance: Int,
    @SerializedName("Science Fiction")
    val scienceFiction: Int,
    @SerializedName("Sexual Abuse")
    val sexualAbuse: Int,
    @SerializedName("Super Power")
    val superPower: Int,
    @SerializedName("Supernatural")
    val supernatural: Int,
    @SerializedName("Thriller")
    val thriller: Int,
    @SerializedName("Vampire")
    val vampire: Int,
    @SerializedName("Virtual Reality")
    val virtualReality: Int,
    @SerializedName("Zombie")
    val zombie: Int
)