package com.devsoc.divyansh.yogaforu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import com.devsoc.divyansh.yogaforu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val repository = YogaRepository()


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            naukasana.load(repository.images[0]){
                transformations(CircleCropTransformation())
            }

            dhanurasana.load(repository.images[1]){
                transformations(CircleCropTransformation())
            }

            bhujangasana.load(repository.images[2]){
                transformations(CircleCropTransformation())
            }

            vakrasana.load(repository.images[3]){
                transformations(CircleCropTransformation())
            }

            naukasana.setOnClickListener {
                asanaName.text = "Naukasana"
                yogaAsanaImage.load(repository.images[0])
                asanaDescription.text = repository.descriptionStrings[0]
            }

            dhanurasana.setOnClickListener {
                asanaName.text = "Dhanurasana"
                yogaAsanaImage.load(repository.images[1])
                asanaDescription.text = repository.descriptionStrings[1]
            }

            bhujangasana.setOnClickListener {
                asanaName.text = "Bhujangasana"
                yogaAsanaImage.load(repository.images[2])
                asanaDescription.text = repository.descriptionStrings[2]
            }

            vakrasana.setOnClickListener {
                asanaName.text = "Vakrasana"
                yogaAsanaImage.load(repository.images[3])
                asanaDescription.text = repository.descriptionStrings[3]
            }
        }
    }

    override fun onStart() {
        super.onStart()

    }
}