package sa.edu.tuwaiq.tsuki.View.Main.Detials

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import sa.edu.tuwaiq.tsuki.R

private const val TAG = "AnimeDetailsFragment"
class AnimeDetailsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_anime_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            val details1: String? = requireArguments().getString("details1")
            val details2: String? = requireArguments().getString("details2")
            val details3: String? = requireArguments().getString("details3")

            val titleEn : TextView = view.findViewById(R.id.AnimeTitleEn_TextView)
            val description : TextView = view.findViewById(R.id.AnimeDiscreption_TextView)
            val youtube : WebView = view.findViewById(R.id.webView)

            youtube.settings.javaScriptEnabled = true

            titleEn.setText(details1)
            description.setText(details2)
            youtube.loadUrl(details3!!)




    }
}