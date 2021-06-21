package k12tt.luongvany.verysimpleproject.bai1linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import k12tt.luongvany.verysimpleproject.R

class Bai1Activity : AppCompatActivity() {
    private lateinit var saveButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bai1_activity)
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