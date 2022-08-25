package com.yagizgokce.dice_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var imageView: ImageView
    private lateinit var resultText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)
        resultText = findViewById(R.id.textView)
        button.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice(){
        val randomInt= Random.nextInt(6)+1 // Generate random number
        var drawableResource=when(randomInt){ // Choose case
            1 -> R.drawable.ic_dice_1
            2 -> R.drawable.ic_dice_2
            3 -> R.drawable.ic_dice_3
            4 -> R.drawable.ic_dice_4
            5 -> R.drawable.ic_dice_5
            else -> R.drawable.ic_dice_6
        }
        imageView.setImageResource(drawableResource) //Set image
        resultText.setText(" $randomInt "  ) //Set dice number
    }

}