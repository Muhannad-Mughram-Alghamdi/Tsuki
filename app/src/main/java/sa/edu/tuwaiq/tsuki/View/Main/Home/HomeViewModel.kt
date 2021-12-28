package sa.edu.tuwaiq.tsuki.View.Main.Home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import sa.edu.tuwaiq.tsuki.Repositories.ApiServiceRepository

private const val TAG = "HomeViewModel"
class HomeViewModel : ViewModel() {

    private val apiRepo = ApiServiceRepository.get()


    fun callAnimes(){
//        viewModelScope.launch(Dispatchers.IO){
//            try {
//
//            }
//        }
    }

}