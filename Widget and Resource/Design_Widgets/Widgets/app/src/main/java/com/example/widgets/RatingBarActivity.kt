package com.example.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widgets.databinding.ActivityRatingBarBinding

class RatingBarActivity : AppCompatActivity() {
    val binding by lazy { ActivityRatingBarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            binding.textView.text = "$rating"
        }
    }
}