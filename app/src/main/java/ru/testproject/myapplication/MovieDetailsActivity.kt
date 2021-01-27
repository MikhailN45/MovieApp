package ru.testproject.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val backButtonToMainActivity: TextView = findViewById(R.id.back_button_text)
        backButtonToMainActivity.setOnClickListener { moveToTheMainScreen() }
    }

    private fun moveToTheMainScreen() {
        val backToTheMainIntent = Intent(this, MainActivity::class.java)
        startActivity(backToTheMainIntent)
    }

}