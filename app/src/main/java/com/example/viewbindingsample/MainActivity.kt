package com.example.viewbindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.name.text = "Activity입니다."
        binding.id.text = "Activity의 id입니다."
        binding.password.text = "Activity의 password입니다"
    }
}