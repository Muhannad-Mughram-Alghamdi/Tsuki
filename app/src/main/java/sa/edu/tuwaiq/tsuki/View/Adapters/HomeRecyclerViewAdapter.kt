package sa.edu.tuwaiq.tsuki.View.Adaptersimport

import android.content.Context
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import sa.edu.tuwaiq.tsuki.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime.Anime_Model
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime.Data
import sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime.Titles
import sa.edu.tuwaiq.tsuki.Model.CategoriesModel.Categories.Anime
import sa.edu.tuwaiq.tsuki.Model.CategoriesModel.Categories.Catagories_Model
import sa.edu.tuwaiq.tsuki.View.Main.Home.HomeViewModel

private const val TAG = "HomeRecyclerViewAdapter"
    /***
    Once you've determined your "layout" and adding the "layout manager", you need to implement your
    "Adapter" and "ViewHolder".
    These two classes work together to define how your data is displayed.
        * The "Adapter" :: creates ViewHolder objects as needed, and also sets the data for those views.
        * The "ViewHolder" :: is a wrapper around a View that contains the layout
            * for an individual item in the list.
    ------------------------------------------------------------------------------------------------
    When you define your adapter, you need to override three key methods:
    1 - onCreateViewHolder()
    2 - onBindViewHolder() >>> The process of associating views to their data is called "binding"
    3 - getItemCount()
    **/
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
///\\//\\//\\//\\//\\//\\//\\//\\//\\// Adapter Class \\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
class HomeRecyclerViewAdapter(private val context : Context, var allCategory: List<Catagories_Model>) :
    RecyclerView.Adapter<HomeRecyclerViewAdapter.HomeViewHolder>() {
        /**
         * DiffUtil is a utility class that can calculate the difference between two lists and
            * output a list of update operations that converts the first list into the second one.
         * It can be used to calculate updates for a RecyclerView Adapter.
        Most of the time our list changes completely and we set new list to RecyclerView Adapter.
        And we call notifyDataSetChanged to update adapter. NotifyDataSetChanged is costly.
        DiffUtil class solves that problem now. It does its job perfectly! **/
        //------------------------------------------------------------------------------------------
        // it check the "list" data is different than the one inside the database
        // the deffer acts as middleman that check the data then give it to the list, it make it own animation
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Catagories_Model>() {
            override fun areItemsTheSame(oldItem: Catagories_Model, newItem: Catagories_Model): Boolean {
                return oldItem.data == newItem.data
            }
            override fun areContentsTheSame(oldItem: Catagories_Model, newItem: Catagories_Model): Boolean {
                return oldItem == newItem
            }
        }
//--------------------------------------------------------------------------------------------------
    private val differ = AsyncListDiffer(this,DIFF_CALLBACK)
    /**
    * onCreateViewHolder(): RecyclerView calls this method whenever it needs to create a new ViewHolder.
    The method creates and initializes the ViewHolder and its associated View,
    but does not fill in the view's contents—the ViewHolder has not yet been bound to specific data.*/
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeRecyclerViewAdapter.HomeViewHolder {
        Log.d(TAG,"OnCreateViewHolder() Called")
        return HomeViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.cardview_of_covers_fragment_layout,
                parent,
                false
            )
        )
//--------------------------------------------------------------------------------------------------
        //nested recyclerview
        return HomeViewHolder(LayoutInflater.from(context)
        .inflate(R.layout.cardview_of_covers_fragment_layout,parent,false))
    }
//--------------------------------------------------------------------------------------------------
    /**
    * onBindViewHolder(): RecyclerView calls this method to associate a ViewHolder with data.
    The method fetches the appropriate data and uses the data to fill in the view holder's layout.
    For example, if the RecyclerView displays a list of names,
    the method might find the appropriate name in the list and fill in the view holder's TextView widget.*/
    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        Log.d(TAG,"onBindViewHolder() Called Position : $position")
        val item = differ.currentList[position]
    }
//--------------------------------------------------------------------------------------------------
    /**
    * getItemCount(): RecyclerView calls this method to get the size of the data set.
    For example, in an address book app, this might be the total number of addresses.
    RecyclerView uses this to determine when there are no more items that can be displayed.*/
    override fun getItemCount(): Int {
        return differ.currentList.size
    }
    fun submitList(list: List<Catagories_Model>) {
        differ.submitList(list)
    }
//==================================================================================================
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
////\\//\\//\\//\\//\\//\\//\\//\\// ViewHolder Class \\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //nested recyclerview
        var listName : TextView? = null
        init {
            listName = itemView.findViewById(R.id.list_name_textView)
        }
    }
}