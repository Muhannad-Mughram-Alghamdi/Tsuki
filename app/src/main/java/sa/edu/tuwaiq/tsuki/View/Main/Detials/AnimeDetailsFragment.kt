package sa.edu.tuwaiq.tsuki.View.Main.Detials

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.icu.number.NumberFormatter.with
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions.with
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.with
import com.squareup.picasso.Picasso
import sa.edu.tuwaiq.tsuki.R
import java.io.ByteArrayOutputStream

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
            val animeTitleEn: String? = requireArguments().getString("animeTitleEn")
            val animeTitlejaJP: String? = requireArguments().getString("animeTitlejaJP")
            val animeTitleEnJp: String? = requireArguments().getString("animeTitleEnJp")
            val description: String? = requireArguments().getString("description")
            val trailer: String? = requireArguments().getString("trailer")
            val link :  String? = requireArguments().getString("website")
//            val poster : Bitmap? = requireArguments().getParcelable("posterImage")

            val titleEn : TextView = view.findViewById(R.id.AnimeTitleEn_TextView)
            val titlejaJP : TextView = view.findViewById(R.id.animeTitlejaJP_TextView)
            val titleEnJp : TextView = view.findViewById(R.id.animeTitleEnJp_TextView)
            val descrip : TextView = view.findViewById(R.id.AnimeDiscreption_TextView)
            val youtube : WebView = view.findViewById(R.id.webView)
            val watch : Button = view.findViewById(R.id.WatchButton)
//            val animePoster : ImageView = view.findViewById(R.id.AnimePoster_ImageView)
//            val x = coverBitmaptouri(requireContext(),poster)
            youtube.settings.javaScriptEnabled = true

            titleEn.setText(animeTitleEn)
            titlejaJP.setText(animeTitlejaJP)
            titleEnJp.setText(animeTitleEnJp)
            descrip.setText(description)
            youtube.loadUrl(trailer!!)
//            Picasso.get().load(x).into(animePoster)
        watch.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kitsu.io${link}")
            startActivity(intent)
        }
    }
      fun coverBitmaptouri(context: Context, bitmap: Bitmap?): Uri {
        val bytes = ByteArrayOutputStream()
        bitmap?.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
        val path = MediaStore.Images.Media.insertImage(context.contentResolver, bitmap,
                "Title", null)
            return Uri.parse(path!!.toString())
    }
}