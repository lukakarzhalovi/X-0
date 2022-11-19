package com.example.kakali

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var player1_name:EditText
    private lateinit var player2_name:EditText
    private lateinit var start:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        player1_name = findViewById(R.id.player1_name)
        player2_name = findViewById(R.id.player2_name)
        start = findViewById(R.id.start)
        Log.d("MYTAG", "onCreate")

        start.setOnClickListener {
            val player1 = player1_name.text.toString()
            val player2 = player2_name.text.toString()

            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("player1", player1 )
            intent.putExtra("player2", player2 )
            startActivity(intent)
            finish()

        }

    }
    override fun onStart() {
        super.onStart()
        Log.d("MYTAG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MYTAG", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MYTAG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MYTAG", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MYTAG", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MYTAG", "onDestroy")
    }
}
