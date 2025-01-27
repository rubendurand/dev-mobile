package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val EXTRA_TEXT = "text_to_display"

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val button : Button = findViewById(R.id.btn_valider)
        var buttonClicked: Boolean = false;
        button.setOnClickListener{
            val txtView : TextView = findViewById(R.id.txtView)
            val saisie : EditText = findViewById(R.id.editTextText)
            val txt = saisie.text
            if (txt.toString().equals("afficher nouveau textView")){
                val layoutPrincipal : ConstraintLayout = findViewById(R.id.main2)
                val deuxiemeTextView : TextView = TextView(this)
                deuxiemeTextView.text = txt
                layoutPrincipal.addView(deuxiemeTextView)
            } else {
                txtView.text = txt

            }
            buttonClicked = true
        }

        val btn_suivant : Button = findViewById(R.id.btn_next)
        btn_suivant.setOnClickListener{
            if(buttonClicked) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                val titre: EditText = findViewById(R.id.editTextText)
                intent.putExtra(EXTRA_TEXT, titre.text)
                startActivity(intent)
            }
        }
    }


}