package com.stardev.faone

import android.content.Context
import android.content.Intent
import com.stardev.faone.activity.GreetActivity
import com.stardev.faone.activity.WelcomeActivity

class FAGO {

    companion object {
        fun goWelcome(context: Context, name: String) {
            val intent = Intent(context, WelcomeActivity::class.java)
            intent.putExtra("welcome_name", name)
            context.startActivity(intent)
        }

        fun goGreet(context: Context, name: String) {
            val intent = Intent(context, GreetActivity::class.java)
            intent.putExtra("greet_name", name)
            context.startActivity(intent)
        }
    }
}