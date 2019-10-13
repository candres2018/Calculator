package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;

public class pantalla_inicio extends AppCompatActivity {

    /** Estableciendo el tiempo de espera**/
    private final int SPLASH_DISPLAY_LENGTH = 7000; //El tiempo de espera es alrededor de 3 segundos
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.pantalla_incio);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(pantalla_inicio.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

}