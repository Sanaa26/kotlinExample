package com.example.kotlinexample

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

const val TAG = "Main Activity"
class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        btnStartActivity.setOnClickListener {
//            // launching the coroutine in the lifecycle scope
//            lifecycleScope.launch {
//                while (true) {
//                    delay(1000L)
//                    Log.d(TAG, "Still Running..")
//                }
//            }
//        }
        GlobalScope.launch {
            Log.d(TAG, Thread.currentThread().name.toString())
        }
        Log.d("Outside Global Scope", Thread.currentThread().name.toString())
    }
    }
