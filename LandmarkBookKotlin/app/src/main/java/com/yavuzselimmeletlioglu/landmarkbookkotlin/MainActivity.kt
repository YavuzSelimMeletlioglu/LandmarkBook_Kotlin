package com.yavuzselimmeletlioglu.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yavuzselimmeletlioglu.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var landmarks: ArrayList<Landmarks>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarks = ArrayList<Landmarks>()

        val pisa = Landmarks("Italy" ,"Pisa" , R.drawable.pisa )
        val eiffel = Landmarks("France" , "Eiffel Tower" , R.drawable.eiffel)
        val colosseum = Landmarks("Italy" , "Colosseum" , R.drawable.colosseum)
        val londonBridge = Landmarks("UK" , "London Bridge" , R.drawable.londonbridge)

        landmarks.add(pisa)
        landmarks.add(eiffel)
        landmarks.add(colosseum)
        landmarks.add(londonBridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarksAdapter(landmarks)
        binding.recyclerView.adapter = adapter

    }
}