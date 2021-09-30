package com.example.fuckingbug
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) }
    fun but(view: android.view.View) {
        var it = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(it) }
    fun hell(view: android.view.View) {
        var it2 = Intent(this@MainActivity, MainActivity2::class.java)
        var nm1 = findViewById<EditText>(R.id.editTextTextPersonName)
        var nm2 = findViewById<EditText>(R.id.editTextTextPersonName2)
        it2.putExtra("username", nm1.text.toString())
        it2.putExtra("gift", nm2.text.toString())
        startActivity(it2)}
}