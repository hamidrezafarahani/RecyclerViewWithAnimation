package com.example.recyclerviewwithanimation

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewwithanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ColorAdapter().apply {
            submitList(
                listOf(
                    Color.BLUE,
                    Color.RED,
                    Color.YELLOW,
                    Color.GREEN,
                    Color.CYAN,
                    Color.MAGENTA,
                    Color.DKGRAY
                )
            )
        }

        binding.recyclerView.adapter = adapter
    }
}