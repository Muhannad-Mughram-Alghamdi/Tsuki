package sa.edu.tuwaiq.tsuki.View.Main.Identity

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import sa.edu.tuwaiq.tsuki.R
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsLogger
import com.google.firebase.auth.FirebaseAuth
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.facebook.login.widget.LoginButton
import java.util.*
import com.facebook.FacebookException
import com.facebook.login.LoginResult
import com.facebook.FacebookCallback
import com.facebook.login.LoginManager
import com.facebook.CallbackManager
import com.facebook.CallbackManager.Factory.create
import sa.edu.tuwaiq.tsuki.View.MainActivity
import com.facebook.AccessToken

private const val TAG = "FacebookActivity"
class FacebookActivity : AppCompatActivity() {
    private lateinit var  callbackManager : CallbackManager
    private lateinit var firebaseAuth : FirebaseAuth
    private lateinit var loginButton : Button
    private val EMAIL = "email"

//==================================================================================================
//==================================================================================================
@RequiresApi(Build.VERSION_CODES.P) //for the Gif cover
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook)
//--------------------------------------------------------------------------------------------------
        val accessToken = AccessToken.getCurrentAccessToken()
        val isLoggedIn = accessToken != null && !accessToken.isExpired
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
//                    val intent = Intent(this,MainActivity::class.java)
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
    private fun move(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
//==================================================================================================
}