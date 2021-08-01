package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var viewIntent : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_type_1.setOnClickListener(this)
        btn_type_2.setOnClickListener(this)
        btn_type_3.setOnClickListener(this)
    }


    override fun onClick(v: View?) {

        when(v?.id) {
            R.id.btn_type_1 -> {
                // ActionBar 없애기 1 -> 화면에 표시할 Activity 에 상속을 Activity 로 해준다.
                viewIntent = Intent(applicationContext, TitleBarATypeActivity::class.java)
                startActivity(viewIntent)
            }

            R.id.btn_type_2 -> {
                // ActionBar 없애기 2 -> 화면에 표시할 Activity 의 Manifest Theme 를
                // android:theme="@style/Theme.AppCompat.DayNight.NoActionBar" 설정
                viewIntent = Intent(applicationContext, TitleBarBTypeActivity::class.java)
                startActivity(viewIntent)
            }

            R.id.btn_type_3 -> {
                // ActionBar 없애기 3 -> 화면에 표시할 Activity 에 setContentView 위에
                // supportRequestWindowFeature(Window.FEATURE_NO_TITLE) 설정!
                viewIntent = Intent(applicationContext, TitleBarCTypeActivity::class.java)
                startActivity(viewIntent)
            }
        }
    }
}