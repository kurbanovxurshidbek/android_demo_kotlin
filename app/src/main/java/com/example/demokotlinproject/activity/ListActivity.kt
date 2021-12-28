package com.example.demokotlinproject.activity

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlinproject.R
import com.example.demokotlinproject.adapter.MemberAdapter
import com.example.demokotlinproject.model.Member

class ListActivity : AppCompatActivity() {
    val TAG = ListActivity::class.java.toString()

    var listView: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        initViews()
    }

    fun initViews() {
        listView = findViewById<ListView>(R.id.listView)

        val members: ArrayList<Member> = ArrayList<Member>()
        members.add(Member(R.mipmap.ic_launcher, "Xurshidbek"))
        members.add(Member(R.mipmap.ic_launcher_round, "Begzodbek"))
        members.add(Member(R.mipmap.ic_launcher, "Xurshidbek"))
        members.add(Member(R.mipmap.ic_launcher_round, "Begzodbek"))

        refreshAdapter(members)
    }

    fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = MemberAdapter(this, members)
        listView!!.adapter = adapter
    }
}