package sa.edu.tuwaiq.tsuki.View.Adaptersimport

import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import com.squareup.picasso.Picasso
import sa.edu.tuwaiq.tsuki.R
import sa.edu.tuwaiq.tsuki.View.Main.Detials.AnimeDetailsFragment
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
class HomeRecyclerViewAdapter(val homeViewModel : HomeViewModel, val view : View) :
    RecyclerView.Adapter<HomeRecyclerViewAdapter.HomeViewHolder>() {
        var animeDetailsFragment = AnimeDetailsFragment()
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
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Data>() {
            override fun areItemsTheSame(oldItem: sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Data, newItem: sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Data
            ): Boolean {
                return oldItem.attributes == newItem.attributes
            }
            override fun areContentsTheSame(oldItem: sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Data, newItem: sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Data
            ): Boolean {
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
                R.layout.cover_recyclerview_layout,
                parent,
                false
            )
        )
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
        val bundle = Bundle()

        holder.TitleText.text = item.attributes.titles.en
        Picasso.get().load(item.attributes.posterImage.medium).into(holder.MediaCover)
        val youtube =  "https://www.youtube.com/embed/${item.attributes.youtubeVideoId}"
        holder.itemView.setOnClickListener {
            bundle.putString("details1",item.attributes.titles.en)
            bundle.putString("details2",item.attributes.description)
            bundle.putString("details3",youtube)


            it.findNavController().navigate(R.id.action_homeFragment_to_animeDetailsFragment1,bundle)
        }
    }
//--------------------------------------------------------------------------------------------------
    /**
    * getItemCount(): RecyclerView calls this method to get the size of the data set.
    For example, in an address book app, this might be the total number of addresses.
    RecyclerView uses this to determine when there are no more items that can be displayed.*/
    override fun getItemCount(): Int {
        return differ.currentList.size
    }
//==================================================================================================
        fun submitList(list : List<sa.edu.tuwaiq.tsuki.Model.AnimeModel.Anime_Trending.Data>){
            differ.submitList(list) //submitList will add data inside the the DB
            //^^^ this line/fun is instead of VVV
            //clear
            //add
        }
//==================================================================================================
//==================================================================================================
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
////\\//\\//\\//\\//\\//\\//\\//\\// ViewHolder Class \\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val MediaCover : ImageView = itemView.findViewById(R.id.Anime_cover_watching_home_imageView)
        val TitleText : TextView = itemView.findViewById(R.id.Anime_Title_watching_list_home_textview)
    }
}