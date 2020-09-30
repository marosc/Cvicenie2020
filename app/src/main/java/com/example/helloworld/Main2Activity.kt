package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//pristup cez Extension funkcie
class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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