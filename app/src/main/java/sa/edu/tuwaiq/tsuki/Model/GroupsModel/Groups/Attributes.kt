package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Groups


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("about")
    val about: String,
    @SerializedName("avatar")
    val avatar: Avatar,
    @SerializedName("coverImage")
    val coverImage: CoverImage,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("featured")
    val featured: Boolean,
    @SerializedName("lastActivityAt")
    val lastActivityAt: String,
    @SerializedName("leadersCount")
    val leadersCount: Int,
    @SerializedName("locale")
    val locale: Any,
    @SerializedName("membersCount")
    val membersCount: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("neighborsCount")
    val neighborsCount: Int,
    @SerializedName("nsfw")
    val nsfw: Boolean,
    @SerializedName("privacy")
    val privacy: String,
    @SerializedName("rules")
    val rules: Any,
    @SerializedName("rulesFormatted")
    val rulesFormatted: Any,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("tagline")
    val tagline: Any,
    @SerializedName("updatedAt")
    val updatedAt: String
)