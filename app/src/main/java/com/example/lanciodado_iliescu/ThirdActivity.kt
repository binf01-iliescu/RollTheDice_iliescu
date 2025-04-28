package com.example.lanciodado_iliescu

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val mioRandom = intent.getIntExtra("numeroRandom", -1)
        val numeroInput = intent.getIntExtra("numeroInput", -1)
        val textResult = findViewById<TextView>(R.id.textResult) //campo di testo per il risultato
        if(numeroInput != mioRandom){
            textResult.text = "Hai perso!"
        }
        else{
            textResult.text = "Hai vinto!"
        }
        val diceView = findViewById<ImageView>(R.id.diceView)
        val dadi = when(mioRandom){
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            else -> {R.drawable.dice_face_6}
        }
        diceView.setImageResource(dadi as Int)
    }
}