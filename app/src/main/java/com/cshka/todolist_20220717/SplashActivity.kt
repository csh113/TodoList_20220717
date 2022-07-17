package com.cshka.todolist_20220717

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val myHandler = Handler(Looper.getMainLooper()) //Handler를 변수로 - duplicated 된 것 없애는 방법 Looper.getMainLooper()

        myHandler.postDelayed(
            {
                val myIntent = Intent(this, MainActivity::class.java)
                startActivity(myIntent)
        }
        , 1500) //2500
    }
}