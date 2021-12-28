package com.example.demokotlinproject.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlinproject.R

class DetailActivity : AppCompatActivity() {
    var TAG = DetailActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
    }

    fun initViews() {

//        val b_exit = findViewById<Button>(R.id.b_exit)
//        val tv_detail = findViewById<TextView>(R.id.tv_detail)
//        b_exit.setOnClickListener{
//            backToFinish()
//        }
//
//        var user = intent.getSerializableExtra("user")
//        Log.d(TAG,user.toString())
//
//        tv_detail.text = user.toString()
    }

    fun backToFinish(){
        val intent = Intent()
        intent.putExtra("result","Thanks a lot")
        setResult(RESULT_OK,intent)
        finish()
    }
}