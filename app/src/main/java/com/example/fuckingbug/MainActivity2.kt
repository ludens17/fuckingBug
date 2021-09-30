package com.example.fuckingbug
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val username1 = findViewById<TextView>(R.id.textView2)
        var user:String?=intent.extras?.getString("username")
        var gift:String?= intent.extras?.getString("gift")
        username1.text = "$user , вам передали $gift" }
}