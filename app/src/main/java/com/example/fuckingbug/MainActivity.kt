package com.example.fuckingbug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun but(view: android.view.View) {
        var it = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(it)




    }

    fun hell(view: android.view.View) {

        var it2 = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(it2)

    }
}