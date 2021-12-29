package sa.edu.tuwaiq.tsuki.View.Adaptersimport

import androidx.recyclerview.widget.RecyclerView
import sa.edu.tuwaiq.tsuki.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sa.edu.tuwaiq.tsuki.View.Main.Home.HomeViewModel
    /***
    Once you've determined your layout, you need to implement your
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
class HomeRecyclerViewAdapter(private val list: List<HomeViewModel>) :
    RecyclerView.Adapter<HomeRecyclerViewAdapter.HomeViewHolder>() {
//--------------------------------------------------------------------------------------------------
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeRecyclerViewAdapter.HomeViewHolder {
        return HomeViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.cardview_of_covers_fragment_layout,
                parent,
                false
            )
        )
    }
//--------------------------------------------------------------------------------------------------
    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = list[position]
        TODO("bind view with data")
    }
//--------------------------------------------------------------------------------------------------
    override fun getItemCount(): Int {
        return list.size
    }
//==================================================================================================
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
////\\//\\//\\//\\//\\//\\//\\//\\// ViewHolder Class \\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}