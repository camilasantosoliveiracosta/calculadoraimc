package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
        //criar uma variavel e associar (=) o componente de UI<EditText>
        //Recuperar o botão na tela
        //Colocar ação no botao setOnclickListener
        //Recuperar o texto digitado no edt peso



        val edtPeso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edittext_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso = edtPeso.text
            val altura = edtAltura.text
            println("Camila" + peso)
        }



    }


}