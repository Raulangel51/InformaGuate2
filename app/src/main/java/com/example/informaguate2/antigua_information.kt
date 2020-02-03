package com.example.informaguate2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class antigua_information : AppCompatActivity() {

    lateinit var  comentario: EditText;
    lateinit var intento: Intent;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_antigua_information)
        comentario = findViewById(R.id.coment)

    }

    fun regresar(view: View){
        //realiza en intetn para mandar otra vez a la principal
        intento = Intent(this, MainActivity::class.java);
        startActivity(intento);

        //se muestra el toast con el comentario
        val toast = Toast.makeText(applicationContext, comentario.text, Toast.LENGTH_SHORT)
        toast.show();

    }
}
