package com.example.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.widgets.databinding.ActivityProgressBarBinding
import kotlin.concurrent.thread

class ProgressBarActivity : AppCompatActivity() {
    val binding by lazy { ActivityProgressBarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        thread(start = true) {
            Thread.sleep(3000)
            runOnUiThread {
                showProgress(false)
            }
        }
    }

    fun showProgress(show : Boolean) {
        if (show) {
            binding.progressLayout.visibility = View.VISIBLE
        } else {
            binding.progressLayout.visibility = View.GONE
        }
    }
}