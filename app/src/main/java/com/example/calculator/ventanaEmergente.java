package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ventanaEmergente extends AppCompatActivity {

    private TextView textView_acerca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_emergente);
        textView_acerca = (TextView) findViewById(R.id.textView_acerca);
    }
    public void volver(View view){
        Intent intent = new Intent(ventanaEmergente.this,MainActivity.class);
        startActivity(intent);
    }
}
