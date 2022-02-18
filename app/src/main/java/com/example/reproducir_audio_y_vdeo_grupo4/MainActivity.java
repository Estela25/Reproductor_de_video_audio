package com.example.reproducir_audio_y_vdeo_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void video(View view){
        Intent Video = new Intent(this,Video.class);
        startActivity(Video);
    }

    public void camara(View view) {
        Intent Camara = new Intent(this, Camara.class);
        startActivity(Camara);
    }
}