package com.example.eventcademyui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        setUpSplash()

    }

    private fun setUpSplash() {
        lifecycleScope.launch {
            delay(3000)
            val intent = Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}