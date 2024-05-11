package com.example.booksclubsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.booksclubsapp.databinding.ActivityRegBinding

class RegActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityRegBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(binding.reg) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val regBtn: Button = binding.regBtn
        val toLogInBtn: Button = binding.toLogInBtn

        toLogInBtn.setOnClickListener {
            val intent = Intent(this, RegActivity::class.java)
            finish()
        }
    }
}