package sa.edu.tuwaiq.tsuki.View.Main.Home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.w3c.dom.Attr
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime.Anime_Model
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime.Data
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Anime_Trending_Model
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Attributes
import sa.edu.tuwaiq.tsuki.Model.CategoriesModel.Categories.Catagories_Model
import sa.edu.tuwaiq.tsuki.Repositories.ApiServiceRepository
private const val TAG = "HomeViewModel"
class HomeViewModel : ViewModel() {

    private val apiRepo = ApiServiceRepository.get()

    val animeTrendingLiveData = MutableLiveData<List<sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Data>>()
    val animeErrorLiveData = MutableLiveData<String>()
//--------------------------------------------------------------------------------------------------
    fun callAnimeTrending(){ //call the request and take the data from "animeLiveData" ^^^
        viewModelScope.launch(Dispatchers.IO){
            try{
             val response = apiRepo.getAnimeTrending()

                if(response.isSuccessful){
                    response.body()?.run {
                        //the live data will transform from background to front process
                        Log.d(TAG,this.toString()) //use it a lot to see data
                        animeTrendingLiveData.postValue(data)
                    }
                } else {
                    Log.d(TAG,response.message())
                    animeErrorLiveData.postValue(response.message())
                }
            }catch (e : Exception){
                Log.d(TAG, e.message.toString())
                animeErrorLiveData.postValue(e.message.toString())
            }
        }
    }

}