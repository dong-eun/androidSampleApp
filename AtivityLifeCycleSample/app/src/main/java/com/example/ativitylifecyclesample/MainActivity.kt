package com.example.ativitylifecyclesample

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // 로그에 사용할 태그 이름
    private val TAG = "MainActivityLifeCycle"

    // Activity 처음 생성 시 호출
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d(TAG, "onCreate is called")
    }

    // Activity 화면 노출 시 호출
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart is called")
    }

    // Activity 사용 준비 시 호출
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume is called")
    }

    // 사용 중인 Activity 일시 정시 시 호출
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause is called")
    }

    // Activity 가 화면 내 보이지 않을 시 호출
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop is called")
    }

    // Activity 종료 시 호출 (memory 정리)
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy is called")
    }

    // Activity 가 재 시작 시 호출
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart is called")
    }
}