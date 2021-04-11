package shmuly.sternbach.laundrysorter

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity concreate run")
        val recyclerView = findViewById<RecyclerView?>(R.id.recycler_view)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = CustomAdapter(
            listOf(
                "Pants 1",
                "Pants 2",
                "Pants 3",
                "Pants 4",
                "Pants 5",
                "Pants 6",
                "Pants 7"
            )
        )
    }
}