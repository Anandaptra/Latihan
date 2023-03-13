package com.example.okee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

const val NAMA_PANGGILAN = "NANDA"

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class OrderActivity : AppCompatActivity() {
    fun asalDaerah() {
        println("Yogyakarta")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
    }
}