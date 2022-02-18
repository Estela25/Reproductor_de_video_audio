package com.example.reproducir_audio_y_vdeo_grupo4;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        String path = "androi.resource://"+ getPackageName() + "/" +
                R.raw.rawr;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}