package sa.edu.tuwaiq.tsuki.View.Adaptersimport

import androidx.recyclerview.widget.RecyclerView
import sa.edu.tuwaiq.tsuki.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sa.edu.tuwaiq.tsuki.View.Main.Home.HomeViewModel

class HomeRecyclerViewAdapter(private val list: List<HomeViewModel>) :
    RecyclerView.Adapter<HomeRecyclerViewAdapter.HomeViewHolder>() {
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

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = list[position]
        TODO("bind view with data")
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}