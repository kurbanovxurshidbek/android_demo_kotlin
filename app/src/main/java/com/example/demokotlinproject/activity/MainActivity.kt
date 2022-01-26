package com.example.demokotlinproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.demokotlinproject.R
import com.example.demokotlinproject.model.User

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.toString()
    lateinit var tv_home: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        tv_home = findViewById<TextView>(R.id.tv_home)
        val b_detail = findViewById<Button>(R.id.b_detail)
        b_detail.setOnClickListener {
//            var user = User(id = 11, name = "PDP")
//            openDetailActivity(user)
            //openListActivity()
            //openRecyclerActivity()
            //openAdvancedActivity()
            //openFragmentActivity()
            //openRuntimeActivity()
            //openViewPagerActivity()
            //openAnimationActivity()
            openBackStackActivity()
        }
    }

    var detailLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            var result = data!!.getStringExtra("result")
            tv_home.text = result
        }
    }

    fun openDetailActivity(user: User) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("user", user)
        detailLauncher.launch(intent)
    }

    fun openListActivity() {
        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
    }

    fun openRecyclerActivity() {
        val intent = Intent(this, RecyclerActivity::class.java)
        startActivity(intent)
    }

    fun openAdvancedActivity() {
        val intent = Intent(this, AdvancedActivity::class.java)
        startActivity(intent)
    }

    fun openFragmentActivity() {
        val intent = Intent(this, FragmentActivity::class.java)
        startActivity(intent)
    }

    fun openRuntimeActivity() {
        val intent = Intent(this, RuntimeActivity::class.java)
        startActivity(intent)
    }

    fun openViewPagerActivity() {
        val intent = Intent(this, ViewPagerActivity::class.java)
        startActivity(intent)
    }
    fun openAnimationActivity() {
        val intent = Intent(this, AnimationActivity::class.java)
        startActivity(intent)
    }

    fun openBackStackActivity() {
        val intent = Intent(this, BackStackActivity::class.java)
        startActivity(intent)
    }
}