package com.example.lanciodado_iliescu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonLancia = findViewById<Button>(R.id.buttonLancia)
        var textViewtitle = findViewById<TextView>(R.id.textViewtitle)
        var imageView = findViewById<ImageView>(R.id.imageView)
        buttonLancia.setOnClickListener(View.OnClickListener {
            val mioToast = Toast.makeText(this, "DADO LANCIATO!!", Toast.LENGTH_LONG)
            mioToast.show()

            //richiamo il secondo main
            lanciaIntent()
        })
    }

        private fun lanciaIntent(){
            val mioIntent = Intent ( this, SecondActivity::class.java)
            startActivity(mioIntent)
        }
}