package k12tt.luongvany.verysimpleproject.bai2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import k12tt.luongvany.verysimpleproject.R

class LoginActivity: AppCompatActivity() {
    private lateinit var saveButton: Button
    private lateinit var cleanText: Button
    private lateinit var userName: EditText
    private lateinit var userPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
    }

    override fun onStart() {
        super.onStart()
        userName = findViewById(R.id.editTextEmail)
        userPassword = findViewById(R.id.editTextPassword)

        cleanText = findViewById<Button?>(R.id.btnDelete).apply{
            setOnClickListener{
                userName.setText("")
                userPassword.setText("")
            }
        }

        saveButton = findViewById<Button?>(R.id.btnSave).apply {
            setOnClickListener{
                if (userName.text.trim() == "admin" && userPassword.text.trim().isNotBlank()){
                    startActivity(
                        Intent(baseContext, UserDetailActivity::class.java).apply {
                            putExtra(NAME, userName.text.toString())
                            putExtra(PASSWORD, userPassword.text.toString())
                        }
                    )
                }else{
                    Snackbar.make(this, "Tên đăng nhập, hoặc mật khẩu của bạn sai", Snackbar.LENGTH_LONG).show()
                }

            }
        }

    }

    companion object{
        const val NAME = "1"
        const val PASSWORD = "2"
    }
}