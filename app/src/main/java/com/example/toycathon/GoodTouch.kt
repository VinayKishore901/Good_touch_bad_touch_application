package com.example.toycathon

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class GoodTouch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_good_touch)
        // no need to call prepare(); create() does that for you
        var mediaPlayer = MediaPlayer.create(this, R.raw.good)
        mediaPlayer.start()
        val handler = Handler()
        handler.postDelayed({ this.finish() }, 3 * 1000)


    }

}