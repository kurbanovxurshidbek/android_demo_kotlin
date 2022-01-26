package com.example.demokotlinproject.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.demokotlinproject.R
import com.example.demokotlinproject.fragments.PageOneFragment
import com.example.demokotlinproject.fragments.PageThirdFragment
import com.example.demokotlinproject.fragments.PageTwoFragment

class BackStackActivity : AppCompatActivity() {
    val TAG = BackStackActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backstack)
        initViews()
    }

    fun initViews() {
        var b_first = findViewById<Button>(R.id.b_first)
        b_first.setOnClickListener(View.OnClickListener { replaceFragment(PageOneFragment()) })
        var b_second = findViewById<Button>(R.id.b_second)
        b_second.setOnClickListener(View.OnClickListener { replaceFragment(PageTwoFragment()) })
        var b_third = findViewById<Button>(R.id.b_third)
        b_third.setOnClickListener(View.OnClickListener { replaceFragment(PageThirdFragment()) })

        replaceFragment(PageOneFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        val backStateName = fragment.javaClass.name
        val manager = supportFragmentManager
        val fragmentPopped = manager.popBackStackImmediate(backStateName, 0)
        if (!fragmentPopped) { //fragment not in back stack, create it.
            val ft = manager.beginTransaction()
            ft.replace(R.id.frameLayout, fragment)
            ft.addToBackStack(backStateName)
            ft.commit()
        }
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 1) {
            finish()
        } else {
            super.onBackPressed()
        }
    }
}