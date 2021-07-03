package k12tt.luongvany.verysimpleproject.giuaki

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import k12tt.luongvany.verysimpleproject.R
import k12tt.luongvany.verysimpleproject.giuaki.model.User
import k12tt.luongvany.verysimpleproject.giuaki.model.UserSingleTon

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
                val newUser = User(userName.text.toString(), userPassword.text.toString())
                if (!UserSingleTon.getUsers().contains(newUser)){
                    UserSingleTon.getUsers().add(newUser)
                    startActivity(
                        Intent(baseContext, AllUserActivity::class.java)
                    )
                }else{
                    AlertDialog.Builder(context)
                        .setTitle("Welcome back!")
                        .setMessage("Welcome back to my app")
                        .setPositiveButton(
                            android.R.string.yes
                        ) { dialog, which ->
                            startActivity(
                                Intent(baseContext, AllUserActivity::class.java)
                            )
                        }
                        .show()
                }
            }
        }

    }

    companion object{
        const val NAME = "1"
        const val PASSWORD = "2"
    }
}