package com.devss.servicepractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var serviceIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonThreadStarter.setOnClickListener {
            startMyService()
        }
    }

    fun startMyService() {
        serviceIntent = Intent(this, MyService::class.java)
        startService(serviceIntent)
    }
}