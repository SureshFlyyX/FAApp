package com.stardev.faapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.stardev.faone.FAGO

class MainActivity : AppCompatActivity() {
    lateinit var btnMain:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMain = findViewById(R.id.btn_main)
        btnMain.setOnClickListener(View.OnClickListener {
            FAGO.goWelcome(this,"Hello World")
        })

    }
}