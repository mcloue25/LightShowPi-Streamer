package com.moveahead.lightshowpiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton youtube, soundcloud, spotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youtube = findViewById(R.id.youtubeBtn);
        youtube.setOnClickListener(this);
        soundcloud = findViewById(R.id.soundcloudBtn);
        soundcloud.setOnClickListener(this);
        spotify = findViewById(R.id.spotifyBtn);
        spotify.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.youtubeBtn:

                Intent youtubeSearch = new Intent(this, YoutubeSearch.class);
                startActivity(youtubeSearch);
                break;

            //For adding details about the player to the JSONObject to be sent tot he backend
            case R.id.soundcloudBtn:
                Intent soundcloudSearch = new Intent(this, SoundCloudSearch.class);
                startActivity(soundcloudSearch);
                break;

            case R.id.spotifyBtn:
                Intent spotifySearch = new Intent(this, SpotifySearch.class);
                startActivity(spotifySearch);
                break;

        }

    }
}