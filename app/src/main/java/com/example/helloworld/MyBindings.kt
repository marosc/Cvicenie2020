package com.example.helloworld

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("hodnota")
fun nastavKocku(view: ImageView, hodnota: Int) {
    when (hodnota) {
        1 -> view.setImageResource(R.drawable.dice_1)
        2 -> view.setImageResource(R.drawable.dice_2)
        3 -> view.setImageResource(R.drawable.dice_3)
        4 -> view.setImageResource(R.drawable.dice_4)
        5 -> view.setImageResource(R.drawable.dice_5)
        6 -> view.setImageResource(R.drawable.dice_6)
    }
}
