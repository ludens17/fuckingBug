package com.example.fuckingbug

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.fuckingbug.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    //private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setContentView(R.layout.content_main)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main2){}



        val username1 = findViewById<TextView>(R.id.textView2)
        var user:String?=intent.extras?.getString("username")
        var gift:String?= intent.extras?.getString("gift")
        username1.text = "$user , вам передали $gift" }
    private fun setContentView(activityMain2: Int, function: () -> Unit) {
        }
}