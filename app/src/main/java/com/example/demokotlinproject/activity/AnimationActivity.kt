package com.example.demokotlinproject.activity

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlinproject.R

class AnimationActivity : AppCompatActivity() {
    lateinit var iv_sample: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        initViews()
    }

    fun initViews() {
        iv_sample = findViewById(R.id.iv_sample)
        var b_zoom = findViewById<Button>(R.id.b_zoom)
        var b_rotate = findViewById<Button>(R.id.b_rotate)
        var b_fade = findViewById<Button>(R.id.b_fade)
        var b_blink = findViewById<Button>(R.id.b_blink)
        var b_move = findViewById<Button>(R.id.b_move)
        var b_slide = findViewById<Button>(R.id.b_slide)

        b_zoom.setOnClickListener{
            var animation = AnimationUtils.loadAnimation(applicationContext,R.anim.zoom)
            iv_sample.startAnimation(animation)
        }
        b_rotate.setOnClickListener{
            var animation = AnimationUtils.loadAnimation(applicationContext,R.anim.rotate)
            iv_sample.startAnimation(animation)
        }
        b_fade.setOnClickListener{
            var animation = AnimationUtils.loadAnimation(applicationContext,R.anim.fade)
            iv_sample.startAnimation(animation)
        }
        b_blink.setOnClickListener{
            var animation = AnimationUtils.loadAnimation(applicationContext,R.anim.blink)
            iv_sample.startAnimation(animation)
        }
        b_move.setOnClickListener{
            var animation = AnimationUtils.loadAnimation(applicationContext,R.anim.move)
            iv_sample.startAnimation(animation)
        }
        b_slide.setOnClickListener{
            var animation = AnimationUtils.loadAnimation(applicationContext,R.anim.slide)
            iv_sample.startAnimation(animation)
        }
    }

}