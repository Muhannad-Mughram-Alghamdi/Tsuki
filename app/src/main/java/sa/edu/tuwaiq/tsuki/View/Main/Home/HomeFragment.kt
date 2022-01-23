package sa.edu.tuwaiq.tsuki.View.Main.Home

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import sa.edu.tuwaiq.tsuki.R
import sa.edu.tuwaiq.tsuki.Repositories.SHARED_PREF_FILE
import sa.edu.tuwaiq.tsuki.View.Adaptersimport.HomeRecyclerViewAdapter

class HomeFragment : Fragment() {
//==================================================================================================
//==================================================================================================
    private var allAnime = listOf<sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Data>() // ??
//==================================================================================================
    private lateinit var homeAdapter: HomeRecyclerViewAdapter
    private val homeViewModel: HomeViewModel by activityViewModels()
//==================================================================================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    // Report that this fragment would like to participate in populating the options menu
    // by receiving a call to onCreateOptionsMenu(Menu, MenuInflater) and related methods.
    homeViewModel.callAnimeTrending()
    }
//==================================================================================================
// "onCreateView" :(the method you initialize and create all your objects, including your TextView)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
//==================================================================================================
//"onViewCreated" is called immediately after onCreatedView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val homeRecyclerView : RecyclerView = view.findViewById(R.id.homeRecyclerView)
        homeAdapter = HomeRecyclerViewAdapter(HomeViewModel(),requireView())
        homeRecyclerView.adapter = homeAdapter
        observers()
//--------------------------------------------------------------------------------------------------
    }
//==================================================================================================
    fun observers(){
        homeViewModel.animeTrendingLiveData.observe(viewLifecycleOwner,{
            homeAdapter.submitList(it)
            allAnime = it
        })
    }
}