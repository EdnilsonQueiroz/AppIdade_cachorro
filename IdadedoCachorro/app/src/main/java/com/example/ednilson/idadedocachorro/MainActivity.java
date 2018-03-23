package com.example.ednilson.idadedocachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idText ;
    private Button idbtn;
    private TextView idresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idText = (EditText) findViewById(R.id.idText);
        idbtn = (Button ) findViewById(R.id.idBtn);
        idresultado = (TextView) findViewById(R.id.idresultado);

        idbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Recuperar oque foi digitado
               String textoDigitado = idText.getText().toString();


                //isEmpty()  Verificar se a string estar vazia
                //Integer.parseInt - tranforma um string em um valor inteiro

                if ( textoDigitado.isEmpty() ){

                    idresultado.setText("Nenhum numero digitado!!!");



                }else {

                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    idresultado.setText("A idade do cachorro e : " + resultadoFinal +"anos.");

                }

            }
        });

    }
}
