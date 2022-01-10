package sa.edu.tuwaiq.tsuki.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import sa.edu.tuwaiq.tsuki.Model.CategoriesModel.Categories.Catagories_Model
import sa.edu.tuwaiq.tsuki.R
import sa.edu.tuwaiq.tsuki.View.Adaptersimport.HomeRecyclerViewAdapter
import sa.edu.tuwaiq.tsuki.View.Main.Community.CommunityFragment
import sa.edu.tuwaiq.tsuki.View.Main.Home.HomeFragment
import sa.edu.tuwaiq.tsuki.View.Main.Profile.ProfileFragment
import sa.edu.tuwaiq.tsuki.View.Main.Search.SearchFragment

class MainActivity : AppCompatActivity() {
//==================================================================================================
//==================================================================================================
//////////////////////////////////////// Navigation Bar ////////////////////////////////////////////
    lateinit var bottomNavigationView: BottomNavigationView
    private val homeFragment = HomeFragment()
    private val searchFragment = SearchFragment()
    private val communityFragment = CommunityFragment()
    private val profileFragment = ProfileFragment()
//==================================================================================================
    private var homeRecyclerView : RecyclerView? = null
    private var homeRecyclerViewAdapter : HomeRecyclerViewAdapter? = null
//==================================================================================================
//==================================================================================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
////////////////////////////////////// Navigation Bar //////////////////////////////////////////////
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        replaceFragment(homeFragment)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.HomeFragment -> replaceFragment(homeFragment)
                R.id.app_bar_search -> replaceFragment(searchFragment)
                R.id.CommunityFragment -> replaceFragment(communityFragment)
                R.id.ProfileFragment -> replaceFragment(profileFragment)
            }
            true
        }
//--------------------------------------------------------------------------------------------------
    }
//==================================================================================================
////////////////////////////////////// Navigation Bar //////////////////////////////////////////////
    private fun replaceFragment(fragment : Fragment){
        if(fragment != null){
            val transection = supportFragmentManager.beginTransaction()
            transection.replace(R.id.fragmentContainerView,fragment)
            transection.commit()
        }
    }
//==================================================================================================
//==================================================================================================
}