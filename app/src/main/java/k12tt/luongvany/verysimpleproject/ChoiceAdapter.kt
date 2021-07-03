package k12tt.luongvany.verysimpleproject

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChoiceAdapter(private val activity: Activity, private val choices: List<Choice>) :
    RecyclerView.Adapter<ChoiceAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_choice, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val choice = choices[position]
        holder.bind(choice)
    }

    override fun getItemCount(): Int {
        return choices.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val titleText: TextView = itemView.findViewById(R.id.title_txt)
        private val descText: TextView = itemView.findViewById(R.id.context_txt)
        private val launchButton: Button = itemView.findViewById(R.id.item_launch_button)

        fun bind(choice: Choice) {
            titleText.text = choice.title
            descText.text = choice.description
            launchButton.setOnClickListener { activity.startActivity(choice.launchIntent) }
        }
    }
}
