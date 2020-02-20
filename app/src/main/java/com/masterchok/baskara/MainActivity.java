package com.masterchok.baskara;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editA;
    private EditText editB;
    private EditText editC;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editA = findViewById(R.id.editA);
        editB = findViewById(R.id.editB);
        editC = findViewById(R.id.editC);
        textResultado = findViewById(R.id.textResultado);
    }

    @SuppressLint("SetTextI18n")
    public void calcularBaskara(View view) {
        double A = Double.parseDouble(editA.getText().toString());
        double B = Double.parseDouble(editB.getText().toString());
        double C = Double.parseDouble(editC.getText().toString());

        double delta = (B * B) - (4 * (A) * (C));
        double resultado1 = -(B) + Math.sqrt(Math.abs(delta));
        double resultado2 = -(B) - Math.sqrt(Math.abs(delta));

        if (delta < 0){
            textResultado.setText("Nenhuma raiz real: quando delta for menor que zero. (negativo) :"+ delta);
        }else if (delta == 0){
            textResultado.setText("Uma única raiz real: quando delta for igual a zero. (nulo) :"+ resultado1);
        }else if (delta > 0){
            textResultado.setText("Duas raízes reais: quando delta for maior que zero. (positivo) :" + resultado1 + resultado2);
        }}

}