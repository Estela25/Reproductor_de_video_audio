package com.example.reproducir_audio_y_vdeo_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Audio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
    }


    public void regresar(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}