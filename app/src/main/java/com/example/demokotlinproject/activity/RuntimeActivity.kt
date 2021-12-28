package com.example.demokotlinproject.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlinproject.R
import com.example.demokotlinproject.fragments.FirstFragment
import com.example.demokotlinproject.fragments.SecondFragment

class RuntimeActivity : AppCompatActivity(), FirstFragment.FirstListener,
    SecondFragment.SecondListener {

    val TAG = RuntimeActivity::class.java.toString()
    var firstFragment: FirstFragment? = null
    var secondFragment: SecondFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_runtime)
        initViews()
    }

    override fun onFirstSend(str: String?) {
        secondFragment!!.updateSecondText("PDP")
    }

    override fun onSecondSend(str: String?) {
        firstFragment!!.updateFirstText("Academy")
    }

    fun initViews() {
        firstFragment = FirstFragment()
        secondFragment = SecondFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameFirst, firstFragment!!)
            .replace(R.id.frameSecond, secondFragment!!)
            .commit()
    }
}