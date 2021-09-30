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
        var nm11:String=nm1.text.toString()
        var nm22:String=nm2.text.toString()
        it2.putExtra("username", nm11)
        it2.putExtra("gift", nm22)
        startActivity(it2) }
}