package com.example.informaguate2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    //variables a utilizar
    lateinit var mostrar: TextView;
    lateinit var text: TextView;
    lateinit var  nombre: EditText;
    lateinit var intento: Intent;
    var cont = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variables para referenciar los textview
        mostrar =findViewById(R.id.textView_mostrar)
        text = findViewById(R.id.textView_nombre)
        nombre = findViewById(R.id.editText_pedir_nombre)
    }

    fun nombre(view: View){
        if(cont == 0){
            //se le coloca el nombre y se hace vivisble
            mostrar.setText(nombre.text)
            mostrar.setVisibility(View.VISIBLE)

            //se vuelven quitan los otros textview de la pantalla
            text.setVisibility(View.GONE)
            nombre.setVisibility(View.GONE)
            cont++
        }
        else{
            //se regresa a la normalidad
            mostrar.setVisibility(View.GONE)
            text.setVisibility(View.VISIBLE)
            nombre.setVisibility(View.VISIBLE)
            nombre.setText("")
            cont=0;
        }
    }

    fun AntiguaInfo(view: View){
        //manda a la aplicacion de antigua
        intento = Intent(this,antigua_information::class.java);
        startActivity(intento);

    }

    fun Tikal(view: View){
        //manda a la aplicacion de tikal
        intento = Intent(this, tikal_information::class.java)
        startActivity(intento);
    }

    fun Reu(view: View){
        //manda a la aplicacion a reu
        intento = Intent(this,reu_information::class.java)
        startActivity(intento);
    }
}
