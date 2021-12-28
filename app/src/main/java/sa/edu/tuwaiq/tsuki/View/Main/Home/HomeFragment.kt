package sa.edu.tuwaiq.tsuki.View.Main.Home

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sa.edu.tuwaiq.tsuki.R
import sa.edu.tuwaiq.tsuki.Repositories.SHARED_PREF_FILE
import sa.edu.tuwaiq.tsuki.View.Adaptersimport.HomeRecyclerViewAdapter
import sa.edu.tuwaiq.tsuki.databinding.FragmentHomeBinding

private val list = listOf<HomeViewModel>()

class HomeFragment : Fragment() {
//==================================================================================================
//==================================================================================================
    private lateinit var binding:FragmentHomeBinding //binding in fragment
    private lateinit var homeAdapter: HomeRecyclerViewAdapter //Adapter
//--------------------------------------------------------------------------------------------------
    private lateinit var sharedPref: SharedPreferences
    private lateinit var sharedPrefEditor: SharedPreferences.Editor
//==================================================================================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true) // Report that this fragment would like to participate in populating the options menu by receiving a call to onCreateOptionsMenu(Menu, MenuInflater) and related methods.
        sharedPref = requireActivity().getSharedPreferences(SHARED_PREF_FILE, Context.MODE_PRIVATE)
        sharedPrefEditor = sharedPref.edit()
    }
//==================================================================================================
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false) //binding in fragment
        return binding.root //binding in fragment
    }
//==================================================================================================
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { //<<"onViewCreated" is called immediately after "onCreateView" :(the method you initialize and create all your objects, including your TextView)
        val homeRecyclerView : RecyclerView = view.findViewById(R.id.homeRecyclerView)
        val homeAdapter = HomeRecyclerViewAdapter(list)
        homeRecyclerView.adapter = homeAdapter
//--------------------------------------------------------------------------------------------------


    }
//==================================================================================================
}