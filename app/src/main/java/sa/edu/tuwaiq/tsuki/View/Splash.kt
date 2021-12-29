package sa.edu.tuwaiq.tsuki.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import sa.edu.tuwaiq.tsuki.R
import sa.edu.tuwaiq.tsuki.Repositories.ApiServiceRepository

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//==================================================================================================
        // Initialize Api Service Repository only for one time with companion object function in ApiServiceRepository class
        ApiServiceRepository.init(this)
//==================================================================================================
        setContentView(R.layout.activity_splash)
        val intent = Intent(this,MainActivity::class.java)

        object : CountDownTimer(1500,1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                startActivity(intent)
                finish()
            }
        }.start()
    }
}