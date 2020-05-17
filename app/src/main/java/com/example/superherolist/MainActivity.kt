package com.example.superherolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.superherolist.R.id.rvSuperheroList

class MainActivity : AppCompatActivity() {

    lateinit var mRecyclerview:RecyclerView
    lateinit var mAdapter:RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setUpRecyclerView()
    }

    fun setUpRecyclerView(){
        mRecyclerview = findViewById(R.id.rvSuperheroList)
        mRecyclerview.setHasFixedSize(true)
        mRecyclerview.layoutManager = LinearLayoutManager(this)
        mAdapter.RecyclerAdapter(getSuperheros(), this)
        mRecyclerview.adapter = mAdapter
    }

    fun getSuperheros(): MutableList<Superhero>{
        var superheros:MutableList<Superhero> = ArrayList()
        superheros.add(Superhero("Deku","UA","Izuku Midoriya","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F721631540266610061%2F&psig=AOvVaw1RaMcTUFMS-4z1rj2GfOA8&ust=1589758464791000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPCqmvrFuekCFQAAAAAdAAAAABAD"))
        superheros.add(Superhero("Daredevil", "Marvel", "Matthew Michael Murdock", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
        superheros.add(Superhero("Wolverine", "Marvel", "James Howlett", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
        superheros.add(Superhero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
        superheros.add(Superhero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
        superheros.add(Superhero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
        superheros.add(Superhero("Green Lantern", "DC", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
        superheros.add(Superhero("Wonder Woman", "DC", "Princess Diana", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))
        return superheros
    }
}
