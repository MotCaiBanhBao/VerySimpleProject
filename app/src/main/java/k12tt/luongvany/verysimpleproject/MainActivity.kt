package k12tt.luongvany.verysimpleproject

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.progressindicator.LinearProgressIndicator

class MainActivity : AppCompatActivity() {
    private lateinit var saveButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        saveButton = findViewById<Button?>(R.id.btnSave).apply {
            setOnClickListener{

                MaterialAlertDialogBuilder(context).apply {
                    setTitle("Đã gửi")
                    setNeutralButton("Ok") { dialog, which ->
                        }
                }.show()
            }
        }

    }
}