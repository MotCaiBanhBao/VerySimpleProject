package k12tt.luongvany.verysimpleproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

abstract class BaseEntryChoiceActivity : AppCompatActivity() {
    private lateinit var mRecycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry_choice)
        mRecycler = findViewById(R.id.choices_recycler)
        mRecycler.layoutManager =  LinearLayoutManager(this)
        mRecycler.adapter = ChoiceAdapter(this, getChoices())
    }

    abstract fun getChoices(): List<Choice>
}
