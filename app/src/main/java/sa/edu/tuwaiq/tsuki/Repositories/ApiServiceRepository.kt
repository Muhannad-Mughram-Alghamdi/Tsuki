package sa.edu.tuwaiq.tsuki.Repositories

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import sa.edu.tuwaiq.tsuki.API.TsukiAPI
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime.Anime_Model
import sa.edu.tuwaiq.tsuki.Model.IdentityModel.Login.Login_Body
//import sa.edu.tuwaiq.tsuki.API.TsukiAPI
import java.lang.Exception

// the REPOSITORY :

//1-//builder retrofit service
//2-//fun "get product" and gave it the token
//3-//&& the companion object to make single object for the repository

const val SHARED_PREF_FILE = "Auth" // we can make a file that contain all the names then call them when needed
//const val TOKEN_KEY = "token"
private const val BASE_URL = "https://kitsu.io/api/edge"


class ApiServiceRepository(val context : Context) { // Context :
//--------------------------------------------------------------------------------------------------
//////////////////////////////////[1] retrofit service[1]///////////////////////////////////////////
    private val retrofitService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private val retrofitApi = retrofitService.create(TsukiAPI::class.java)
    // shared preference VVV <- we save the token inside it // it contain two things SP direct
    private val sharedPref = context.getSharedPreferences(SHARED_PREF_FILE,Context.MODE_PRIVATE)
//--------------------------------------------------------------------------------------------------
/////////////////////////////////// Identity Model /////////////////////////////////////////////////
    suspend fun login(loginBody: Login_Body) = retrofitApi.userLogin(loginBody)
//////////////////////////////////// Anime Model ///////////////////////////////////////////////////
    suspend fun getAnime(id : Int) = retrofitApi.getAnime(id)
    suspend fun getAnimeEpisodes(id : Int) = retrofitApi.getAnimeEpisodes(id)
    suspend fun getAnimeTrending(id : Int) = retrofitApi.getAnimeTrending(id)
//////////////////////////////////// Manga Model ///////////////////////////////////////////////////
    suspend fun getManga(id : Int) = retrofitApi.getManga(id)
    suspend fun getMangaChapters(id : Int) = retrofitApi.getMangaChapters(id)
    suspend fun getMangaTrending(id : Int) = retrofitApi.getMangaTrending(id)
///////////////////////////////// Categories Model /////////////////////////////////////////////////
    suspend fun getCategories(id : Int) = retrofitApi.getCategories(id)
    suspend fun getCategoriesFavorites(id : Int) = retrofitApi.getCategoriesFavorites(id)
///////////////////////////////// Characters Model /////////////////////////////////////////////////
    suspend fun getCharacters(id : Int) = retrofitApi.getCharacters(id)
    suspend fun getAnimeCharacters(id : Int) = retrofitApi.getAnimeCharacters(id)
    suspend fun getMangaCharacters(id : Int) = retrofitApi.getMangaCharacters(id)
///////////////////////////// producers && Staff Model /////////////////////////////////////////////
    suspend fun getAnimeProduction(id : Int) = retrofitApi.getAnimeProduction(id)
    suspend fun getAnimeStaff(id : Int) = retrofitApi.getAnimeStaff(id)
    suspend fun getCasting(id : Int) = retrofitApi.getCasting(id)
    suspend fun getPeople(id : Int) = retrofitApi.getPeople(id)
    suspend fun getProducers(id : Int) = retrofitApi.getProducers(id)
//////////////////////////////// Comments Model ////////////////////////////////////////////////////
    suspend fun getComments(id : Int) = retrofitApi.getComments(id)
    suspend fun getCommentsLikes(id : Int) = retrofitApi.getCommentsLikes(id)
////////////////////////////////// Post Model //////////////////////////////////////////////////////
    suspend fun getPosts(id : Int) = retrofitApi.getPosts(id)
    suspend fun getPostsFollows(id : Int) = retrofitApi.getPostsFollows(id)
    suspend fun getPostsLikes(id : Int) = retrofitApi.getPostsLikes(id)
//////////////////////////////// Reaction Model ////////////////////////////////////////////////////
    suspend fun getMediaReactions(id : Int) = retrofitApi.getMediaReactions(id)
    suspend fun getMediaReactionsVotes(id : Int) = retrofitApi.getMediaReactionsVotes(id)
    suspend fun getReviews(id : Int) = retrofitApi.getReviews(id)
    suspend fun getReviewsLikes(id : Int) = retrofitApi.getReviewsLikes(id)
//////////////////////////////// Streamers Model ///////////////////////////////////////////////////
    suspend fun getStreamers(id : Int) = retrofitApi.getStreamers(id)
    suspend fun getStreamingLinks(id : Int) = retrofitApi.getStreamingLinks(id)
//////////////////////////// Site Announcements Model //////////////////////////////////////////////
    suspend fun getSiteAnnouncements(id : Int) = retrofitApi.getSiteAnnouncements(id)
    ////////////////////////////  Users Model //////////////////////////////////////////////////////
    suspend fun getProfileLinkSites(id : Int) = retrofitApi.getProfileLinkSites(id)
//==================================================================================================
//////////////////////////////////[2]     Manage the token    [2]//////////////////////////////////

//--------------------------------------------------------------------------------------------------
//==================================================================================================
///////////////////////////////////[3]companion object[3]///////////////////////////////////////////

//==================================================================================================
}

