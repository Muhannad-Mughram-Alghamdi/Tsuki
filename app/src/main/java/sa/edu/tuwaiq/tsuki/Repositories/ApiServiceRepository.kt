package sa.edu.tuwaiq.tsuki.Repositories

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import sa.edu.tuwaiq.tsuki.API.TsukiAPI
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime.Anime_Model
//import sa.edu.tuwaiq.tsuki.API.TsukiAPI
import java.lang.Exception

// the REPOSITORY :

//1-//builder retrofit service
//2-//fun "get product" and gave it the token
//3-//&& the companion object to make single object for the repository

const val SHARED_PREF_FILE = "Auth" // we can make a file that contain all the names then call them when needed
//const val TOKEN_KEY = "token"
private const val BASE_URL = "https://kitsu.io"


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
    //suspend fun getAnime() = retrofitApi.getAnime("id")
//////////////////////////////////[2]     Manage the token    [2]//////////////////////////////////

//--------------------------------------------------------------------------------------------------
//==================================================================================================
///////////////////////////////////[3]companion object[3]///////////////////////////////////////////

//==================================================================================================
}

