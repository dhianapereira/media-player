package com.example.media_player

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.media_player.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {

    private val viewBinding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityPlayerBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
    }
}