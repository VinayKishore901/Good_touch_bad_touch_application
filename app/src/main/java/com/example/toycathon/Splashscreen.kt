package com.example.toycathon

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Splashscreen : AppCompatActivity() {
    private lateinit var i : ImageView
    private lateinit var i1 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        i = findViewById<ImageView>(R.id.x)




        Handler().postDelayed({
            /* Create an Intent that will start the Menu-Activity. */
            val mainIntent = Intent(this, Menu::class.java)
            startActivity(mainIntent)
            finish()
        }, 1800)

        var animatorY = ObjectAnimator.ofFloat(i,"y",550f)
        animatorY.setDuration(900)
        var animatorSet = AnimatorSet()
        animatorSet.playTogether(animatorY)
        animatorSet.start()




    }
}