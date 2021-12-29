package sa.edu.tuwaiq.tsuki.View.Main.Home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime.Anime_Model
import sa.edu.tuwaiq.tsuki.Repositories.ApiServiceRepository
/**
 * The ViewModel is a class whose role is to provide data to the UI and survive configuration changes.
 * A ViewModel acts as a communication center between the Repository and the UI.
 * You can also use a ViewModel to share data between fragments.
 *
 * A ViewModel holds your app's UI data in a lifecycle-conscious way that survives configuration changes.
 * Separating your app's UI data from your Activity and Fragment classes lets you better follow the single responsibility principle:
 * Your activities and fragments are responsible for drawing data to the screen,
 * while your ViewModel is responsible for holding and processing all the data needed for the UI.
 * */
private const val TAG = "HomeViewModel"
class HomeViewModel : ViewModel() {
    // Getting instance from Api Service Repository with companion object function
    private val apiRepo = ApiServiceRepository.get()
    val animeLiveData = MutableLiveData<List<Anime_Model>>()
    //any error this VVV will bring it to us //we cant show toast or fragment from viewHolder
    val animeErrorLiveData = MutableLiveData<String>()
//--------------------------------------------------------------------------------------------------
    fun callAnime(){ //call the request and take the data from "animeLiveData" ^^^
    /***
     * Kotlin’s coroutines :: The Kotlin team defines coroutines as “lightweight threads”.
        * They are sort of tasks that the actual threads can execute.
        * Even if the code seems to be in one sequential block,each call to a suspending function
        * delimits the start of a new “sub-task” within the coroutine.
     * Scope in Kotlin’s coroutines can be defined as the restrictions within which the Kotlin coroutines are being executed
////////////////////////////////////////////////////////////////////////////////////////////////////
     * Scopes help to predict the lifecycle of the coroutines. There are basically 4 scopes in Kotlin coroutines:
        1 - Global Scope
        Global Scope is one of the ways by which coroutines are launched.
        When Coroutines are launched within the global scope, they live long as the application does.
        If the coroutines finish it’s a job, it will be destroyed and will not keep alive until the application dies
        --------------------------------------------------------------------------------------------
        2 - LifeCycle Scope ::
        The lifecycle scope is the same as the global scope,
        but the only difference is that when we use the lifecycle scope,
        all the coroutines launched within the activity also dies when the activity dies.
        --------------------------------------------------------------------------------------------
        3 - ViewModel Scope ::
        It is also the same as the lifecycle scope,
        only difference is that the coroutine in this scope will live as long the view model is alive.
         -------------------------------------------------------------------------------------------
        4 - Coroutine Scope ::
         *  It creates a new scope and does not complete until all children’s coroutines complete.
         *  So we are creating a scope, we are running coroutines and inside the scope,
         *  we can create other coroutines.
         *  This coroutine that starts here does not complete until all the inner coroutines complete as well.
     **/
//==================================================================================================
        viewModelScope.launch(Dispatchers.IO){
            // Coroutines Dispatchers
            /**
             * Kotlin coroutines use dispatchers to determine which threads are used for coroutine execution.
             * To run code outside of the main thread, you can tell Kotlin coroutines to perform work on either
                * the Default or IO dispatcher.
             * In Kotlin, all coroutines must run in a dispatcher, even when they're running on the main thread.
             * Coroutines can suspend themselves, and the dispatcher is responsible for resuming them.
             ---------------------------------------------------------------------------------------
             To specify where the coroutines should run, Kotlin provides three dispatchers that you can use:
             * 1- Dispatchers.Main ::
             * Use this dispatcher to run a coroutine on the main Android thread.
             * This should be used only for interacting with the UI and performing quick work.
             ---------------------------------------------------------------------------------------
             * 2 - Dispatchers.IO ::
             * This dispatcher is optimized to perform disk or network I/O outside of the main thread.
             * Examples include using the Room component, reading from or writing to files,
             * and running any network operations.
             ---------------------------------------------------------------------------------------
             * 3 - Dispatchers.Default ::
             * This dispatcher is optimized to perform CPU-intensive work outside of the main thread.
             * */
//==================================================================================================
            // Use "try and catch" for handling http exceptions
//            try {
//                // Calling the API Methods and handles the result
//                val response = apiRepo.getAnime()
//                if(response.isSuccessful) {
//                    response.body()?.run {
//                        //the live data will transform from background to front process
//                        Log.d(TAG, this.toString()) //use it a lot to see data
//                        // Send Response to view
//                        animeLiveData.postValue()
//                    }
//                }else {
//                    Log.d(TAG,response.message())
//                    // Send Error Response to view
//                    animeErrorLiveData.postValue(response.message())
//                }
//            }catch (e : Exception){
//                Log.d(TAG,e.message.toString())
//                // Send Error Response to view
//                animeErrorLiveData.postValue(e.message.toString())
//            }
        }
    }

}