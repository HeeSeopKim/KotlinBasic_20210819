package com.nepplus.kotlinbasic_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn01.setOnClickListener {
            Log.d("메인화면", "첫번째 로그 버튼 눌림")
            Log.e("메인화면", "e로 로그 찍어봄")
            Log.d("메인화면", "i로 로그 찍기")
        }
    }
}