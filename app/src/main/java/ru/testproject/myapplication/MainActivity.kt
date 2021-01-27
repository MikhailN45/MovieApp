package ru.testproject.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieDetailsScreenButton: TextView = findViewById(R.id.movie_details_tv)
        movieDetailsScreenButton.setOnClickListener { moveToTheDetails() }
    }

    private fun moveToTheDetails() {
        val toTheMovieDetailsIntent = Intent(this, MovieDetailsActivity::class.java)
        startActivity(toTheMovieDetailsIntent)
    }
}