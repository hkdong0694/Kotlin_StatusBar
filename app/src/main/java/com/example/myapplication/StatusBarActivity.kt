package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager

class StatusBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_status_bar)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            // API >= 30 이상부터는 이코드를 통해 StatusBar 제어
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            // API >= 30 이상부터는 Deprecated 되었다.
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
    }
}