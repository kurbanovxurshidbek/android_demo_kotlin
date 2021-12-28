package com.example.demokotlinproject.activity

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demokotlinproject.R
import com.example.demokotlinproject.adapter.RecyclerAdapter
import com.example.demokotlinproject.model.Member

class RecyclerActivity : AppCompatActivity() {

    var context: Context? = null
    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        initViews()
    }

    fun initViews() {
        context = this
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView!!.setLayoutManager(GridLayoutManager(context, 1))

        val members: ArrayList<Member> = java.util.ArrayList<Member>()
        members.add(Member(R.mipmap.ic_launcher, "Xurshidbek"))
        members.add(Member(R.mipmap.ic_launcher_round, "Begzodbek"))
        members.add(Member(R.mipmap.ic_launcher, "Xurshidbek"))
        members.add(Member(R.mipmap.ic_launcher_round, "Begzodbek"))

        refreshAdapter(members)
    }

    fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = RecyclerAdapter(context!!, members)
        recyclerView!!.adapter = adapter
    }

}