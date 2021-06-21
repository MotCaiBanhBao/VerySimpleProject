package k12tt.luongvany.verysimpleproject.bai2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textview.MaterialTextView
import k12tt.luongvany.verysimpleproject.R
import k12tt.luongvany.verysimpleproject.bai2.LoginActivity.Companion.NAME
import k12tt.luongvany.verysimpleproject.bai2.LoginActivity.Companion.PASSWORD

class UserDetailActivity: AppCompatActivity() {
    private lateinit var userName: MaterialTextView
    private lateinit var userPassword: MaterialTextView
    private lateinit var logout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_detail)
        userName = findViewById(R.id.user_name)
        userPassword = findViewById(R.id.user_password)
        logout = findViewById(R.id.logout)
    }

    override fun onStart() {
        super.onStart()
        userName.text = getString(R.string.userNameText, intent.getStringExtra(NAME))
        userPassword.text =  getString(R.string.passwordText, intent.getStringExtra(PASSWORD))
        logout.setOnClickListener {
            this.finish()
        }
    }

}