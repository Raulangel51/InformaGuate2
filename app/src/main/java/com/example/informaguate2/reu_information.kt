package com.example.informaguate2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class reu_information : AppCompatActivity() {

    lateinit var  comentario: EditText;
    lateinit var intento: Intent;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reu_information)
        comentario = findViewById(R.id.coment)
    }

    fun regresar(view: View){
        intento = Intent(this, MainActivity::class.java);
        startActivity(intento);

        val toast = Toast.makeText(applicationContext, comentario.text, Toast.LENGTH_SHORT)
        toast.show();

    }
}