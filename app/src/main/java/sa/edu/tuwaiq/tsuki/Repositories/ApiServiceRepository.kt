package sa.edu.tuwaiq.tsuki.Repositories

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import sa.edu.tuwaiq.tsuki.API.TsukiAPI
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime.Anime_Model
import sa.edu.tuwaiq.tsuki.Model.IdentityModel.Login.Login_Body
//import sa.edu.tuwaiq.tsuki.API.TsukiAPI
import java.lang.Exception

/**
 * A Repository is a class that abstracts access to multiple data sources (Room db, Network).
 * It is a suggested best practice for code separation and architecture. A Repository class handles data operations
 * */
//--------------------------------------------------------------------------------------------------
// the REPOSITORY contain :
//1-//builder retrofit service
//2-//fun "get product" and gave it the token
//3-//&& the companion object to make single object for the repository

const val SHARED_PREF_FILE = "Auth" // we can make a file that contain all the names then call them when needed
//const val TOKEN_KEY = "token"
private const val BASE_URL = "https://kitsu.io"


class ApiServiceRepository(val context : Context) { // Context :
//--------------------------------------------------------------------------------------------------
//////////////////////////////////[1] retrofit service[1]///////////////////////////////////////////
    /***
     *
     * To work with Retrofit you basically need the following three classes:
    1 - Model class which is used as a JSON model
    2 - Interfaces that define the possible HTTP operations
    3 - Retrofit.Builder class - Instance which uses the interface and the Builder API
        to allow defining the URL end point for the HTTP operations.
     * */
//--------------------------------------------------------------------------------------------------
    // Retrofit.Builder
    // And we need to specify a factory for deserializing the response using the Gson library
    private val retrofitService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    //  Builder API
    // You can then use the create method from the retrofitService to get an instance of the api.
    private val retrofitApi = retrofitService.create(TsukiAPI::class.java)
    /*
    * SharedPreferences offers a framework to save persistent data in key-value pairs.(Token)
    * It works for any primitive data type (meaning booleans, ints, longs, floats, and strings).
    * Which also means that it’s pretty simple to work with.* */
    private val sharedPref = context.getSharedPreferences(SHARED_PREF_FILE,Context.MODE_PRIVATE)
    /**
     * Calling getSharedPreferences() enables you to retrieve a file by name,
     * which means you can have multiple files.* */
//==================================================================================================
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
    companion object{
        private var instance : ApiServiceRepository? = null
        fun init(context: Context){
            if(instance == null)
                instance = ApiServiceRepository(context)
        }
        fun get() : ApiServiceRepository {
            return instance ?: throw Exception("ApiServiceRepository must be initialized") // ?: -> || -> or
        }
    }
//==================================================================================================
}