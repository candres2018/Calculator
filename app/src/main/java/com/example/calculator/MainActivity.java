package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

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
        int valor1=textView3.length();
        String cadena=textView3.getText().toString().substring(0,valor1-1);
        textView3.setText(cadena);
    }
    public void clear(View view){
        textView3.setText("");
    }
    public void salir(View view){
        System.exit(0);
    }
    public void seno(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "sen";
        textView3.setText(valor2);
    }
    public void coseno(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "cos";
        textView3.setText(valor2);
    }
    public void tangente(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "tan";
        textView3.setText(valor2);
    }
    public void ln(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "ln";
        textView3.setText(valor2);
    }
    public void log(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "log";
        textView3.setText(valor2);
    }
    public void cuadrado(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "^2";
        textView3.setText(valor2);
    }
    public void cubo(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "^3";
        textView3.setText(valor2);
    }
    public void factorial(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "!";
        textView3.setText(valor2);
    }
    public void numeroPi(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "Pi";
        textView3.setText(valor2);
    }
    public void par_Izq(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "(";
        textView3.setText(valor2);
    }
    public void par_Der(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ ")";
        textView3.setText(valor2);
    }
    public void raiz(View view){
        String valor=textView3.getText().toString();
        String valor2=valor+ "Raiz";
        textView3.setText(valor2);
    }
    public void igual(View view){
        String expresion = textView3.getText().toString();
        Expression e = new Expression(expresion);
        String resultado = String.valueOf(e.calculate());
        textView3.setText(resultado);
    }
}
