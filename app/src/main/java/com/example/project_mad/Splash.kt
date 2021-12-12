package com.example.project_mad

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class Splash : AppCompatActivity(), Animation.AnimationListener {
    lateinit var logoAnimation: AnimationDrawable
    lateinit var animation1 : Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        image.setBackgroundResource(R.drawable.animation)

        logoAnimation = image.background as AnimationDrawable

         animation1 = AnimationUtils.loadAnimation(this,R.anim.spin)
        animation1.setAnimationListener(this)


    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)

        if(hasFocus){
            logoAnimation.start()
            image.startAnimation(animation1)
        }
        else
        {
            logoAnimation.stop()
        }

    }

    override fun onAnimationStart(animation: Animation?) {
    }

    override fun onAnimationEnd(animation: Animation?) {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)

        overridePendingTransition(R.anim.scale_in,R.anim.scale_out)
        finish()

    }

    override fun onAnimationRepeat(animation: Animation?) {
    }

}