package com.example.cw

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class EverydayLanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_everyday_language)
        // calling the action bar
        // calling the action bar
        val actionBar: ActionBar? = supportActionBar

        // showing the back button in action bar

        // showing the back button in action bar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}