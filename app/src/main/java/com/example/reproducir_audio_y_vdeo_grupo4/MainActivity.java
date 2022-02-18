package com.example.reproducir_audio_y_vdeo_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
        Intent Camara = new Intent(this, Audio.class);
        startActivity(Camara);
    }
}