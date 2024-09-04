package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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



            val pesoStr: String  = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr == "" || alturaStr == ""){
                //mostrar mensagem para o usuário


                Snackbar
                    .make(
                    edtPeso,
                    "Preencha Todos os Campos",
                    Snackbar.LENGTH_LONG
                )
                    .show()

            }else{
                val peso = edtPeso.text.toString().toFloat()
                val altura = edtAltura.text.toString().toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2
                println("Camila" + resultado)
            }
        }
    }

}