package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.helloworld.databinding.ActivityMain3Binding


//pristup pomocou databinding
class Main3Activity : AppCompatActivity() {
    private var binding: ActivityMain3Binding? = null
    private lateinit var hodenaKocka: HodenaKocka

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hodenaKocka = HodenaKocka(0)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main3)
        binding?.apply {
            hodenaHodnota = hodenaKocka
            tlacidlo.setOnClickListener {
                hodenaKocka.hodnota = (1..6).random()
                invalidateAll()
            }
        }
    }
    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}