package k12tt.luongvany.verysimpleproject.giuaki

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import k12tt.luongvany.verysimpleproject.R
import k12tt.luongvany.verysimpleproject.giuaki.model.UserSingleTon

class AllUserActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.users_activity)
        val userRecycler: RecyclerView = findViewById(R.id.users_ryc_view)

        userRecycler.adapter = UserAdapter(this, UserSingleTon.getUsers())
        userRecycler.layoutManager =  LinearLayoutManager(this)
    }
}