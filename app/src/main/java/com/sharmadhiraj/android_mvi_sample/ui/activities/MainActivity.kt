package com.sharmadhiraj.android_mvi_sample.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sharmadhiraj.android_mvi_sample.ui.view.CounterView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterView()
        }
    }
}