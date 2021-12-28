package com.example.demokotlinproject.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlinproject.R

class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        initViews()
    }

    fun initViews() {

    }
}