package com.example.android.swoosha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getstartbutton.setOnClickListener {
            val  slectionIntent = Intent (this, SelectionActivity::class.java)
            startActivity(slectionIntent)
        }

    }
}