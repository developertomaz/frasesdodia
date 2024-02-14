package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases= {
             "Levanta, sacode a poeira, dá a volta por cima.",
             "Respire fundo e fique atento às surpresas deliciosas que a vida preparou para você!",
             "Nem todos os dias são bons, mas há algo bom em cada dia.",
            "Um passo de cada vez. Até meio passo serve. Siga firme, não há motivo para ter pressa.",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view) {

        TextView text = findViewById(R.id.text_result);
       int numeroAleatorio =new Random().nextInt(3);

       String frase = frases[numeroAleatorio];
       text.setText(frase);
    }

    public void exibirTodas(View view){

     TextView text = findViewById(R.id.text_result);

     String textResul = "";

        for (String frase : frases) {

            textResul = textResul + frase + "\n";
        }

        text.setText(textResul);
    }
}