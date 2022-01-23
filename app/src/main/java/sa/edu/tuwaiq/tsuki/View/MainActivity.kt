package sa.edu.tuwaiq.tsuki.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarItemView
import sa.edu.tuwaiq.tsuki.Model.CategoriesModel.Categories.Catagories_Model
import sa.edu.tuwaiq.tsuki.R
import sa.edu.tuwaiq.tsuki.View.Adaptersimport.HomeRecyclerViewAdapter
import sa.edu.tuwaiq.tsuki.View.Main.Community.CommunityFragment
import sa.edu.tuwaiq.tsuki.View.Main.Home.HomeFragment
import sa.edu.tuwaiq.tsuki.View.Main.Profile.ProfileFragment
import sa.edu.tuwaiq.tsuki.View.Main.Search.SearchFragment

class MainActivity : AppCompatActivity() {
//==================================================================================================
//////////////////////////////////////// Navigation Bar ////////////////////////////////////////////
        private lateinit var navController: NavController
        lateinit var bottomNavigationView: BottomNavigationView
//    private val homeFragment = HomeFragment()
//    private val searchFragment = SearchFragment()
//    private val communityFragment = CommunityFragment()
//    private val profileFragment = ProfileFragment()
//==================================================================================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//==================================================================================================
/////////////////////////////////////Navigation bar ////////////////////////////////////////////////
    val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
    navController = navHostFragment.navController
    bottomNavigationView = findViewById(R.id.bottomNavigationView)
    NavigationUI.setupWithNavController(bottomNavigationView,navController)
    bottomNavigationView.setupWithNavController(navController)
//==================================================================================================
/////////////////////////////// Navigation Bar (old way) ///////////////////////////////////////////
//        bottomNavigationView = findViewById(R.id.bottomNavigationView)
//        replaceFragment(homeFragment)
//        bottomNavigationView.setOnNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.HomeFragment -> replaceFragment(homeFragment)
//                R.id.app_bar_search -> replaceFragment(searchFragment)
//                R.id.CommunityFragment -> replaceFragment(communityFragment)
//                R.id.ProfileFragment -> replaceFragment(profileFragment)
//            }
//            true
//        }
//--------------------------------------------------------------------------------------------------
    }
//==================================================================================================
////////////////////////////// Navigation Bar (old way) ////////////////////////////////////////////
//    private fun replaceFragment(fragment : Fragment){
//        if(fragment != null){
//            val transection = supportFragmentManager.beginTransaction()
//            transection.replace(R.id.fragmentContainerView,fragment)
//            transection.commit()
//        }
//    }
//==================================================================================================
//==================================================================================================
}