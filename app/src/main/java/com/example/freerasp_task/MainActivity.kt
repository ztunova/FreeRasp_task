package com.example.freerasp_task

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val talsecApp: TalsecApp = this.applicationContext as TalsecApp
        talsecApp.setCurrentActivity(this)
    }
}