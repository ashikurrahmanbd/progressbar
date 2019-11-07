package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressbarid);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        thread.start();

    }

    public void doWork(){


        for(progress = 20; progress <= 100; progress = progress+20){
            try {
                Thread.sleep(500);
                progressBar.setProgress(progress);
            }catch (InterruptedException e){

                e.printStackTrace();
            }
        }

    }

}
