package sa.edu.tuwaiq.tsuki.Model.UsersModel.Users


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("about")
    val about: String,
    @SerializedName("avatar")
    val avatar: Any,
    @SerializedName("birthday")
    val birthday: Any,
    @SerializedName("commentsCount")
    val commentsCount: Int,
    @SerializedName("coverImage")
    val coverImage: Any,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("favoritesCount")
    val favoritesCount: Int,
    @SerializedName("feedCompleted")
    val feedCompleted: Boolean,
    @SerializedName("followersCount")
    val followersCount: Int,
    @SerializedName("followingCount")
    val followingCount: Int,
    @SerializedName("gender")
    val gender: Any,
    @SerializedName("lifeSpentOnAnime")
    val lifeSpentOnAnime: Int,
    @SerializedName("likesGivenCount")
    val likesGivenCount: Int,
    @SerializedName("likesReceivedCount")
    val likesReceivedCount: Int,
    @SerializedName("location")
    val location: Any,
    @SerializedName("mediaReactionsCount")
    val mediaReactionsCount: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("pastNames")
    val pastNames: List<String>,
    @SerializedName("permissions")
    val permissions: String,
    @SerializedName("postsCount")
    val postsCount: Int,
    @SerializedName("proExpiresAt")
    val proExpiresAt: Any,
    @SerializedName("proTier")
    val proTier: Any,
    @SerializedName("profileCompleted")
    val profileCompleted: Boolean,
    @SerializedName("ratingsCount")
    val ratingsCount: Int,
    @SerializedName("reviewsCount")
    val reviewsCount: Int,
    @SerializedName("slug")
    val slug: Any,
    @SerializedName("status")
    val status: String,
    @SerializedName("subscribedToNewsletter")
    val subscribedToNewsletter: Boolean,
    @SerializedName("title")
    val title: Any,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("waifuOrHusbando")
    val waifuOrHusbando: Any,
    @SerializedName("website")
    val website: Any
)