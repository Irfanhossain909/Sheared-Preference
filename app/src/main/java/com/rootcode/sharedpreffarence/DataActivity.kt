package com.rootcode.sharedpreffarence

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rootcode.sharedpreffarence.databinding.ActivityDataBinding

class DataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDataBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //For save Data and Showing
        val show = getSharedPreferences("SAVE", Context.MODE_PRIVATE)
        binding.emailTxt.text = show.getString("email",null)
        binding.passTxt.text = show.getString("password",null)

    }
}