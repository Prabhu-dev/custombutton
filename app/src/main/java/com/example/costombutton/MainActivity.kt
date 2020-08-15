package com.example.costombutton

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Snackbar.make(it, "Happy Independence Day ", Snackbar.LENGTH_SHORT).show()
        }

    }
}