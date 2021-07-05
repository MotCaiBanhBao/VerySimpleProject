package k12tt.luongvany.verysimpleproject.giuaki

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import k12tt.luongvany.verysimpleproject.R
import k12tt.luongvany.verysimpleproject.bai2.LoginActivity
import k12tt.luongvany.verysimpleproject.bai2.UserDetailActivity
import k12tt.luongvany.verysimpleproject.giuaki.model.User
import k12tt.luongvany.verysimpleproject.giuaki.model.UserSingleTon

class UserAdapter(private val activity: Activity, private val users: List<User>):
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(user: User) {
            val nameText: TextView = itemView.findViewById(R.id.user_name_txt)
            val passwordText: TextView = itemView.findViewById(R.id.user_password_txt)
            val details: Button = itemView.findViewById(R.id.details_user)
            val deleteUser: Button = itemView.findViewById(R.id.delete_user)

            nameText.text = user.name
            passwordText.text = user.password
            deleteUser.setOnClickListener{
                UserSingleTon.getUsers().remove(User(user.name, user.password))
                notifyDataSetChanged()
            }
            details.setOnClickListener{
                activity.startActivity(
                    Intent(activity.baseContext, UserDetailActivity::class.java).apply {
                        putExtra(LoginActivity.NAME, user.name)
                        putExtra(LoginActivity.PASSWORD, user.password)
                    }
                )
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return users.size
    }

}