package com.example.toycathon

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class BadTouch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad_touch)
        var mediaPlayer = MediaPlayer.create(this, R.raw.bad)
        mediaPlayer.start()
        val handler = Handler()
        handler.postDelayed({ this.finish() }, 3 * 1000)
    }
}