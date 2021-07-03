package k12tt.luongvany.verysimpleproject.giuaki

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import k12tt.luongvany.verysimpleproject.R
import k12tt.luongvany.verysimpleproject.giuaki.LoginActivity

class WelcomeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_activity)

         findViewById<Button>(R.id.startButton).apply {
            setOnClickListener{
                startActivity(
                    Intent(context, LoginActivity::class.java)
                )
                finish()
            }
         }
    }
}