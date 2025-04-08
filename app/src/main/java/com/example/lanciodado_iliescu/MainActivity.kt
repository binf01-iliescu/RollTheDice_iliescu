package com.example.rollthedice5bi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lanciodado_iliescu.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnRoll = findViewById<Button>(R.id.buttonLancia)
        var txtTitle = findViewById<TextView>(R.id.textViewtitle)
        var imgView = findViewById<ImageView>(R.id.imageView)
        btnRoll.setOnClickListener(View.OnClickListener {
            var mioToast = Toast.makeText(this,"DADO LANCIATO!!", Toast.LENGTH_LONG)
            mioToast.show()
        })
    }
}