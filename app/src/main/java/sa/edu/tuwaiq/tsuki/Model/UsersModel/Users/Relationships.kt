package sa.edu.tuwaiq.tsuki.Model.UsersModel.Users


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("blocks")
    val blocks: Blocks,
    @SerializedName("categoryFavorites")
    val categoryFavorites: CategoryFavorites,
    @SerializedName("favorites")
    val favorites: Favorites,
    @SerializedName("followers")
    val followers: Followers,
    @SerializedName("following")
    val following: Following,
    @SerializedName("libraryEntries")
    val libraryEntries: LibraryEntries,
    @SerializedName("linkedAccounts")
    val linkedAccounts: LinkedAccounts,
    @SerializedName("notificationSettings")
    val notificationSettings: NotificationSettings,
    @SerializedName("oneSignalPlayers")
    val oneSignalPlayers: OneSignalPlayers,
    @SerializedName("pinnedPost")
    val pinnedPost: PinnedPost,
    @SerializedName("profileLinks")
    val profileLinks: ProfileLinks,
    @SerializedName("quotes")
    val quotes: Quotes,
    @SerializedName("reviews")
    val reviews: Reviews,
    @SerializedName("stats")
    val stats: Stats,
    @SerializedName("userRoles")
    val userRoles: UserRoles,
    @SerializedName("waifu")
    val waifu: Waifu
)