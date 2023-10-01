package com.rootcode.sharedpreffarence

import android.content.Context
import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rootcode.sharedpreffarence.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //For save Data and Showing
//        val show = getSharedPreferences("SAVE",Context.MODE_PRIVATE)
//        binding.emailETxt.setText(show.getString("email",null))
//        binding.passwordETxt.setText(show.getString("password",null))

        //Botton Work done
        binding.savebtn.setOnClickListener {
            val editor = getSharedPreferences("SAVE",Context.MODE_PRIVATE).edit()
            editor.putString("email",binding.emailETxt.text.toString())
            editor.putString("password",binding.passwordETxt.text.toString())
            editor.apply()
            //For Chenging one activity to another Activity
            startActivity(Intent(this,DataActivity::class.java))
        }
    }
}