package com.yavuzselimmeletlioglu.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yavuzselimmeletlioglu.landmarkbookkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        var landmarks = intent.getSerializableExtra("landmark") as Landmarks
        binding.countryText.text = landmarks.countryName
        binding.imageView.setImageResource(landmarks.landmarkImage)
        binding.landmarkName.text = landmarks.landmarkName
    }
}