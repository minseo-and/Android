package com.example.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.addTextChangedListener
import com.example.widgets.databinding.ActivityTextBinding

class TextActivity : AppCompatActivity() {
    val binding by lazy { ActivityTextBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        binding.editText.addTextChangedListener {
            Log.d("EditText","현재 입력된 값 = ${it.toString()}")
        }
    }
}