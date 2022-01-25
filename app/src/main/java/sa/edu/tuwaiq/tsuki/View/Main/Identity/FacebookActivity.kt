package sa.edu.tuwaiq.tsuki.View.Main.Identity

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.facebook.*
import com.facebook.CallbackManager.Factory.create
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.facebook.login.widget.LoginButton
import com.google.firebase.auth.FirebaseAuth
import sa.edu.tuwaiq.tsuki.R
import sa.edu.tuwaiq.tsuki.View.MainActivity
import java.util.*


private const val TAG = "FacebookActivity"
class FacebookActivity : AppCompatActivity() {
    private lateinit var  callbackManager : CallbackManager
    private lateinit var firebaseAuth : FirebaseAuth
    private lateinit var loginButton : Button
    private val EMAIL = "email"
//--------------------------------------------------------------------------------------------------
    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var nbuilder: Notification.Builder
    val channelId = "i.apps.notifications"
    val description = "Welcome to your app"
//--------------------------------------------------------------------------------------------------
    val accessToken = AccessToken.getCurrentAccessToken()
    val isLoggedIn = accessToken != null && !accessToken.isExpired
//==================================================================================================
//==================================================================================================
@RequiresApi(Build.VERSION_CODES.P) //for the Gif cover
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook)
//--------------------------------------------------------------------------------------------------
        firebaseAuth = FirebaseAuth.getInstance()
        FacebookSdk.sdkInitialize(applicationContext)
        callbackManager = create()
//==================================================================================================
        val gifView: ImageView = findViewById(R.id.GifView)
        gifView.setImageResource(R.drawable.slides)
//==================================================================================================
        FaceBookLoginManager()
        FacebookButton()
//==================================================================================================
    }
//==================================================================================================
/////////////////////////////////// Login Result ///////////////////////////////////////////////////
//==================================================================================================
     private fun FacebookButton() {
        loginButton = findViewById<View>(R.id.login_button) as LoginButton
        (loginButton as LoginButton).setReadPermissions(Arrays.asList(EMAIL))
        // If you are using in a fragment, call loginButton.setFragment(this);
        // Callback registration
        (loginButton as LoginButton).registerCallback(callbackManager,
            object : FacebookCallback<LoginResult?> {
                override fun onSuccess(result: LoginResult?) {
                    Log.d(TAG, "OnSuccess")
                    //handle
                    move()
                    notification()
                }

                override fun onCancel() {
                    Log.d(TAG, "OnCancel")
                }

                override fun onError(exception: FacebookException) {
                    Log.d(TAG, "$exception")
                }
            })
    }
//==================================================================================================
////////////////////////////////////// Token Handler ///////////////////////////////////////////////
//==================================================================================================
    private fun FaceBookLoginManager() {
    LoginManager.getInstance().registerCallback(callbackManager,
        object : FacebookCallback<LoginResult?> {
            override fun onSuccess(result: LoginResult?) {
                Log.d(TAG, "OnSuccess")
                pass()
            }

            override fun onCancel() {
                Log.d(TAG, "OnCancel")
            }

            override fun onError(exception: FacebookException) {
                Log.d(TAG, "$exception")
            }
        })
    }
//==================================================================================================
    override fun onActivityResult(requestCode : Int, resultCode : Int, data : Intent?) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data)
    }
//==================================================================================================
    private fun move(){
        accessToken
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    private fun pass(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
//==================================================================================================
fun notification() {
    notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        notificationChannel =
            NotificationChannel(channelId, description, NotificationManager.IMPORTANCE_HIGH)
        notificationChannel.enableLights(true)

        notificationChannel.enableVibration(false)
        notificationManager.createNotificationChannel(notificationChannel)

        val intent: Intent = Intent(this, MainActivity::class.java)
        intent.putExtra("Notification", true)

        val pendingIntent =
            PendingIntent.getActivity(this, 444, intent, PendingIntent.FLAG_UPDATE_CURRENT)
        nbuilder = Notification.Builder(this, channelId)
            .setSmallIcon(R.drawable.fi_rr_fox)
            .setContentTitle("Welcome To Your App")
            .setContentIntent(pendingIntent)
            .setLargeIcon(
                BitmapFactory.decodeResource(
                    this.resources, R.drawable.fi_rr_fox
                )
            )
    } else {

        nbuilder = Notification.Builder(this)
            .setSmallIcon(R.drawable.fi_rr_fox)
            .setLargeIcon(
                BitmapFactory.decodeResource(
                    this.resources,
                    R.drawable.fi_rr_fox
                )
            )
    }
    notificationManager.notify(1001, nbuilder.build())
}
//==================================================================================================
}