package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView3 = (TextView) findViewById(R.id.textView3);
    }
    public void ceroo(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'0';
        textView3.setText(valor2);
    }
    public void uno(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'1';
        textView3.setText(valor2);
    }
    public void dos(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'2';
        textView3.setText(valor2);
    }
    public void tres(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'3';
        textView3.setText(valor2);
    }
    public void cuatro(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'4';
        textView3.setText(valor2);
    }
    public void cinco(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'5';
        textView3.setText(valor2);
    }
    public void seis(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'6';
        textView3.setText(valor2);
    }
    public void siete(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'7';
        textView3.setText(valor2);
    }
    public void ocho(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'8';
        textView3.setText(valor2);
    }
    public void nueve(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'9';
        textView3.setText(valor2);
    }
    public void sumar(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'+';
        textView3.setText(valor2);
    }
    public void restar(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'-';
        textView3.setText(valor2);
    }
    public void multiplicar(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'*';
        textView3.setText(valor2);
    }
    public void dividir(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'/';
        textView3.setText(valor2);
    }
    public void acercaDe(View view){
        Intent intent = new Intent(MainActivity.this,ventanaEmergente.class);
        startActivity(intent);
    }
    public void punto(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+'.';
        textView3.setText(valor2);
    }
    public void del(View view){
        int valor3=textView3.getText().length();
        String valor1=textView3.getText().toString();
        textView3.setText("");
        String valor2="";

        for ( int factor = 0; factor <= valor3-1; factor ++ ) {
            valor2=valor2+valor1.charAt(factor);
            textView3.setText(textView3.getText().toString()+valor2);
        }
    }
    public void clear(View view){
        textView3.setText("");
    }
    public void salir(View view){
        finish();
    }
    public void seno(View view){
        finish();
    }
    public void coseno(View view){
        finish();
    }
    public void tangente(View view){
        finish();
    }
    public void ln(View view){
        finish();
    }
    public void log(View view){
        finish();
    }
    public void cuadrado(View view){
        finish();
    }
    public void cubo(View view){
        finish();
    }
    public void factorial(View view){
        finish();
    }
    public void numeroPi(View view){
        finish();
    }
    public void par_Izq(View view){
        finish();
    }
    public void par_Der(View view){
        finish();
    }
    public void raiz(View view){
        finish();
    }
}
