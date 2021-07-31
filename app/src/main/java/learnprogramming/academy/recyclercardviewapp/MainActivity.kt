package learnprogramming.academy.recyclercardviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayList=ArrayList<Model>()
        arrayList.add(Model("Newsfeed","this is newsfeed description",R.drawable.pic1))
        arrayList.add(Model("Business","this is business description",R.drawable.pic2))
        arrayList.add(Model("People","this is people description",R.drawable.pic3))
        arrayList.add(Model("Notes","this is notes description",R.drawable.pic4))
        arrayList.add(Model("Feedback","this is feedback description",R.drawable.pic5))
        arrayList.add(Model("Newsfeed","this is newsfeed description",R.drawable.pic1))
        arrayList.add(Model("Business","this is business description",R.drawable.pic2))
        arrayList.add(Model("People","this is people description",R.drawable.pic3))
        arrayList.add(Model("Notes","this is notes description",R.drawable.pic4))
        arrayList.add(Model("Feedback","this is feedback description",R.drawable.pic5))

        val myAdapter = MyAdapter(arrayList,this)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=myAdapter

    }
}