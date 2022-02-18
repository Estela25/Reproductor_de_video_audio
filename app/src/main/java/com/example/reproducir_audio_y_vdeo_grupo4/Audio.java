package com.example.reproducir_audio_y_vdeo_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Audio extends AppCompatActivity implements View.OnClickListener {
    
    Button iniciar, parar;
    MediaPlayer mediaPlayer;
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        
        iniciar = (Button)findViewById(R.id.btInicar);
        parar = (Button)findViewById(R.id.btDetener);
        mediaPlayer = MediaPlayer.create(this, R.raw.rave);
        
        iniciar.SetOnClickListener(this);
        parar.SetOnClickListener(this);
        
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.btInicar:
                play();
                break;
            case R.id.btDetener:
                stop();
                break;
        }
    }
    
    private void play(){
        mediaPlayer.start();
    }
    
    private void stop(){
        mediaPlayer.stop();
    }

    public void regresar(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}