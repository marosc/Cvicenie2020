package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//zakladny pristup cez FindById()
class MainActivity : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var tlacidlo: Button
    private lateinit var kocka: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.text)
        kocka = findViewById(R.id.kocka)
        tlacidlo = findViewById(R.id.tlacidlo)

        tlacidlo.setOnClickListener{
            val randomInt = (1..6).random()
            text.text = randomInt.toString()

            when (randomInt){
                1 -> kocka.setImageResource(R.drawable.dice_1)
                2 -> kocka.setImageResource(R.drawable.dice_2)
                3 -> kocka.setImageResource(R.drawable.dice_3)
                4 -> kocka.setImageResource(R.drawable.dice_4)
                5 -> kocka.setImageResource(R.drawable.dice_5)
                6 -> kocka.setImageResource(R.drawable.dice_6)
            }
        }

    }
}