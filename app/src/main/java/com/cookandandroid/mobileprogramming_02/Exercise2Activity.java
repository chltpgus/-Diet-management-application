package com.cookandandroid.mobileprogramming_02;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Exercise2Activity extends YouTubeBaseActivity {

    YouTubePlayerView viewY1;
    Button btnY1;
    YouTubePlayer.OnInitializedListener listener;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise2);

        btnY1 = (Button) findViewById(R.id.btnY1);
        viewY1 = (YouTubePlayerView) findViewById(R.id.yview1);
        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("TUvQKwLWAUg");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        btnY1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewY1.initialize("AIzaSyDvhuOkXULFdDqde1BgQeEWNJgCkGnWm8k",listener);
            }
        });
    }
}
