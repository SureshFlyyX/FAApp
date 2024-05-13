package com.stardev.faone.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stardev.faone.R

class GreetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet)
    }
}