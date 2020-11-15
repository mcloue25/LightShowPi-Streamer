package com.moveahead.lightshowpiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class YoutubeSearch extends AppCompatActivity implements View.OnClickListener{

    private Button search;
    private FloatingActionButton backBtn;
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_search);

        search = findViewById(R.id.YTSearchBtn);
        search.setOnClickListener(this);
        searchText = findViewById(R.id.searchQueryET);
        backBtn = findViewById(R.id.youtubeHomeBtn);

    }

    @Override
    public void onClick(View view) {

    }
}