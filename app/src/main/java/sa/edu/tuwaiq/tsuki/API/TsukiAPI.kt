package sa.edu.tuwaiq.tsuki.API

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime.*
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Episodes.Anime_Episodes_Model
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Anime_Trending_Model
import sa.edu.tuwaiq.tsuki.Model.CategoriesModel.Categories.Catagories_Model
import sa.edu.tuwaiq.tsuki.Model.CategoriesModel.CategoriesFavorites.Categories_Favorite_Model
import sa.edu.tuwaiq.tsuki.Model.CharactersModel.Anime_Characters.Anime_Characters_Model
import sa.edu.tuwaiq.tsuki.Model.CharactersModel.Characters.Characters_Model
import sa.edu.tuwaiq.tsuki.Model.CharactersModel.Manga_Characters.Manga_Characters_Model
import sa.edu.tuwaiq.tsuki.Model.CommentsModel.Comments.Comments_Model
import sa.edu.tuwaiq.tsuki.Model.CommentsModel.Comments_Likes.Comments_Likes_Model
import sa.edu.tuwaiq.tsuki.Model.IdentityModel.Login.Login_Body
import sa.edu.tuwaiq.tsuki.Model.IdentityModel.Login.Login_Model
import sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga.Manga_Model
import sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga_Chapters.Manga_Chapters_Model
import sa.edu.tuwaiq.tsuki.Model.MangaModel.Manga_Trending.Manga_Trending_Model
import sa.edu.tuwaiq.tsuki.Model.PostsModel.Posts.Posts_Model
import sa.edu.tuwaiq.tsuki.Model.PostsModel.PostsFollows.Posts_Follows_Model
import sa.edu.tuwaiq.tsuki.Model.PostsModel.PostsLikes.Posts_Likes_Model
import sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Anime_Productions.Anime_Productions_Model
import sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Anime_Staff.Anime_Staff_Model
import sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Casting.Casting_Model
import sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.People.People_Model
import sa.edu.tuwaiq.tsuki.Model.ProducersAndStaffModel.Producers.Producers_Model
import sa.edu.tuwaiq.tsuki.Model.ReactionsModel.MediaReactionVotes.Media_Reactions_Votes_Model
import sa.edu.tuwaiq.tsuki.Model.ReactionsModel.MediaReactions.Media_Reactions_Model
import sa.edu.tuwaiq.tsuki.Model.ReactionsModel.ReviewLikes.Review_Likes_Model
import sa.edu.tuwaiq.tsuki.Model.ReactionsModel.Reviews.Reviews_Model
import sa.edu.tuwaiq.tsuki.Model.SiteAnnouncementsModel.Site_Announcments_Model
import sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streamers.Streamers_Model
import sa.edu.tuwaiq.tsuki.Model.StreamersModel.Streaming_Links.Streaming_Links_Model
import sa.edu.tuwaiq.tsuki.Model.UsersModel.ProfileLinkSites.Profile_Link_Sites_Model

//DOCUMENTATION IS EVERYTHING, its not fixed, its defer between developers, READ THEM
// 1-method 2-path 3-authorization 4-response
//==================================================================================================
//==================================================================================================
// most the info like GET/POST need Authorization ...etc, can be found in the API documentations
//==================================================================================================
//VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
//==================================================================================================
interface TsukiAPI { // HTTP request we receive HTTP respond
////////////////////////////////////////////////////////////////////////////////////////////////////
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
/////////////////////////////////////.:~Identity Model~:.///////////////////////////////////////////
//////////////////////////////////////.:~Login Model~:./////////////////////////////////////////////
    @GET("https://kitsu.io/api/oauth/token")
    suspend fun userLogin(
    @Body loginBody: Login_Body
    ): Response<Login_Model>
//////////////////////////////////////.:~Anime Model~:./////////////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
////////////////////////////////////////.:~Anime~:./////////////////////////////////////////////////
    @GET("/api/edge/anime/{id}")
    suspend fun getAnime(
        @Path("id") id: Int
    ): Response<Anime_Model>
//--------------------------------------------------------------------------------------------------
///////////////////////////////////.:~Anime Episodes~:./////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/episodes/{id}")
    suspend fun getAnimeEpisodes(
        @Path("id") id : Int
    ): Response<Anime_Episodes_Model>
//--------------------------------------------------------------------------------------------------
///////////////////////////////////.:~Anime Trending~:./////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/trending/anime/{id}")
    suspend fun getAnimeTrending(
        @Path("id") id:Int
    ): Response<Anime_Trending_Model>
//==================================================================================================
//////////////////////////////////////.:~Manga Model~:./////////////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
////////////////////////////////////////.:~Manga~:./////////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/manga/{id}")
    suspend fun getManga(
        @Path("id") id : Int
    ):Response<Manga_Model>
//--------------------------------------------------------------------------------------------------
////////////////////////////////////.:~Manga Chapters~:.////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/chapters/{id}")
    suspend fun getMangaChapters(
        @Path("id") id : Int
    ):Response<Manga_Chapters_Model>
//--------------------------------------------------------------------------------------------------
////////////////////////////////////.:~Manga Trending~:.////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/trending/manga/{id}")
    suspend fun getMangaTrending(
        @Path("id") id : Int
    ):Response<Manga_Trending_Model>
//==================================================================================================
///////////////////////////////////.:~Categories Model~:.///////////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
//////////////////////////////////////.:~Categories~:.//////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/categories/{id}")
    suspend fun getCategories(
        @Path("id") id : Int
    ):Response<Catagories_Model>
//--------------------------------------------------------------------------------------------------
/////////////////////////////////.:~Categories Favorites~:./////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/category-favorites/{id}")
    suspend fun getCategoriesFavorites(
        @Path("id") id : Int
    ):Response<Categories_Favorite_Model>
    //POST Patch DELETE
//==================================================================================================
///////////////////////////////////.:~Characters Model~:.///////////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
//////////////////////////////////////.:~Characters~:.//////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/characters/{id}")
    suspend fun getCharacters(
        @Path("id") id : Int
    ):Response<Characters_Model>
//--------------------------------------------------------------------------------------------------
///////////////////////////////////.:~Anime Characters~:.///////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/anime-characters/{id}")
    suspend fun getAnimeCharacters(
        @Path("id") id : Int
    ):Response<Anime_Characters_Model>
//--------------------------------------------------------------------------------------------------
///////////////////////////////////.:~Manga Characters~:.///////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/manga-characters/{id}")
    suspend fun getMangaCharacters(
        @Path("id") id : Int
    ):Response<Manga_Characters_Model>
//==================================================================================================
////////////////////////////////.:~Producers && Staff Model~:.//////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
////////////////////////////////////.:~Anime Production~:.//////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/anime-productions/{id}")
    suspend fun getAnimeProduction(
        @Path("id") id : Int
    ):Response<Anime_Productions_Model>
//--------------------------------------------------------------------------------------------------
    @GET("https://kitsu.io/api/edge/anime-staff/{id}")
    suspend fun getAnimeStaff(
        @Path("id") id : Int
    ):Response<Anime_Staff_Model>
//--------------------------------------------------------------------------------------------------
    @GET("https://kitsu.io/api/edge/castings/{id}")
    suspend fun getCasting(
        @Path("id") id : Int
    ):Response<Casting_Model>
//--------------------------------------------------------------------------------------------------
    @GET("https://kitsu.io/api/edge/people/{id}")
    suspend fun getPeople(
        @Path("id") id : Int
    ):Response<People_Model>
//--------------------------------------------------------------------------------------------------
    @GET("https://kitsu.io/api/edge/producers/{id}")
    suspend fun getProducers(
        @Path("id") id : Int
    ):Response<Producers_Model>
//==================================================================================================
////////////////////////////////////.:~Comments Model~:.////////////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
///////////////////////////////////////.:~Comments~:.///////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/comments/{id}")
    suspend fun getComments(
        @Path("id") id : Int
    ):Response<Comments_Model>
//--------------------------------------------------------------------------------------------------
////////////////////////////////////.:~Comments Likes~:.////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/comment-likes/{id}")
    suspend fun getCommentsLikes(
        @Path("id") id : Int
    ):Response<Comments_Likes_Model>
//==================================================================================================
///////////////////////////////////////.:~Post Model~:./////////////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
/////////////////////////////////////////.:~Posts~:.////////////////////////////////////////////////
@GET("https://kitsu.io/api/edge/posts/{id}")
suspend fun getPosts(
    @Path("id") id : Int
):Response<Posts_Model>
//--------------------------------------------------------------------------------------------------
/////////////////////////////////////.:~Posts follows~:.////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/post-follows/{id}")
    suspend fun getPostsFollows(
        @Path("id") id : Int
    ):Response<Posts_Follows_Model>
//--------------------------------------------------------------------------------------------------
/////////////////////////////////////.:~Posts Likes~:.//////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/post-likes/{id}")
    suspend fun getPostsLikes(
        @Path("id") id : Int
    ):Response<Posts_Likes_Model>
//==================================================================================================
////////////////////////////////////.:~Reactions Model~:.///////////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
///////////////////////////////////.:~Media Reactions~:.////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/media-reactions/{id}")
    suspend fun getMediaReactions(
        @Path("id") id : Int
    ):Response<Media_Reactions_Model>
//--------------------------------------------------------------------------------------------------
////////////////////////////////.:~Media Reactions Votes~:./////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/media-reaction-votes/{id}")
    suspend fun getMediaReactionsVotes(
        @Path("id") id : Int
    ):Response<Media_Reactions_Votes_Model>
//--------------------------------------------------------------------------------------------------
///////////////////////////////////////.:~Reviews~:.////////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/reviews/{id}")
    suspend fun getReviews(
        @Path("id") id : Int
    ):Response<Reviews_Model>
//--------------------------------------------------------------------------------------------------
///////////////////////////////////.:~Reviews Likes~:.//////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/review-likes/{id}")
    suspend fun getReviewsLikes(
        @Path("id") id : Int
    ):Response<Review_Likes_Model>
//==================================================================================================
////////////////////////////////////.:~Streamers Model~:.///////////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
///////////////////////////////////////.:~Streamers~:.//////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/streamers/{id}")
    suspend fun getStreamers(
        @Path("id") id : Int
    ):Response<Streamers_Model>
//--------------------------------------------------------------------------------------------------
////////////////////////////////////.:~Streaming Links~:.///////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/streaming-links/{id}")
    suspend fun getStreamingLinks(
        @Path("id") id : Int
    ):Response<Streaming_Links_Model>
//==================================================================================================
////////////////////////////////.:~Site Announcements Model~:.//////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
///////////////////////////////////.:~Site Announcements~:./////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/site-announcements/{id}")
    suspend fun getSiteAnnouncements(
        @Path("id") id : Int
    ):Response<Site_Announcments_Model>
//==================================================================================================
/////////////////////////////////////.:~Users Model~:.//////////////////////////////////////////////
////\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
////////////////////////////////.:~profile link sites~:.////////////////////////////////////////////
    @GET("https://kitsu.io/api/edge/profile-link-sites/{id}")
    suspend fun getProfileLinkSites(
        @Path("id") id : Int
    ):Response<Profile_Link_Sites_Model>
//--------------------------------------------------------------------------------------------------
/////////////////////////////////////.:~Blocks~:.///////////////////////////////////////////////////

//--------------------------------------------------------------------------------------------------
////////////////////////////////////.:~Favorites~:./////////////////////////////////////////////////

//--------------------------------------------------------------------------------------------------
/////////////////////////////////////.:~Follows~:.//////////////////////////////////////////////////

//--------------------------------------------------------------------------------------------------
/////////////////////////////////.:~LinkedAccounts~:.///////////////////////////////////////////////

//--------------------------------------------------------------------------------------------------
//////////////////////////////////.:~ProfileLinks~:.////////////////////////////////////////////////

//--------------------------------------------------------------------------------------------------
/////////////////////////////////////.:~Roles~:.////////////////////////////////////////////////////

//--------------------------------------------------------------------------------------------------
/////////////////////////////////////.:~Stats~:.////////////////////////////////////////////////////

//--------------------------------------------------------------------------------------------------
///////////////////////////////////.:~UserRoles~:.//////////////////////////////////////////////////

//--------------------------------------------------------------------------------------------------
/////////////////////////////////////.:~Users~:.////////////////////////////////////////////////////

//--------------------------------------------------------------------------------------------------
}