package com.example.demokotlinproject.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlinproject.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initViews()
    }

    fun initViews(){

    }
}