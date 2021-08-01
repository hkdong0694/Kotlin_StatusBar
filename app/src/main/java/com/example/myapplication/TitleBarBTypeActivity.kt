package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TitleBarBTypeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Manifest 를 통해 제어
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_bar_btype)
    }
}