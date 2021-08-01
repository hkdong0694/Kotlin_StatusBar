package com.example.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TitleBarATypeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // 상속을 Activity 로 하면 ActionBar 사라짐
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_bar_atype)
    }
}