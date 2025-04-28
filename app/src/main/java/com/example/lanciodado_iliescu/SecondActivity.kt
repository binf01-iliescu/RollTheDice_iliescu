package com.example.lanciodado_iliescu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val numeroUtente = findViewById<EditText>(R.id.numeroUtente) //numero in input

        val lancia = findViewById<Button>(R.id.lancia) //pulsante per lanciare il dado e richiamare secondo activity
        lancia.setOnClickListener {
            val mioToast = Toast.makeText(this, "DADO LANCIATO!!", Toast.LENGTH_LONG)
            mioToast.show()

            //Convertire input utente ad intero passando per la stringa
            val numStringa = numeroUtente.text.toString()
            val numeroInput = numStringa.toIntOrNull()

            val mioRandom = estraiNumero()
            //Controllo del numero inserito dall'utente
            if(numeroInput != null && numeroInput > 0 && numeroInput <=6 ){
                lanciaIntent(mioRandom, numeroInput)
            }
        }
    }

    private fun estraiNumero(): Int{
        return (1..6).random()
    }

    private fun lanciaIntent(mioRandom: Int, numeroInput: Int){
        val mioIntent = Intent ( this, ThirdActivity::class.java)
        mioIntent.putExtra("numeroRandom", mioRandom)
        mioIntent.putExtra("numeroInput", numeroInput)
        startActivity(mioIntent)
    }
}