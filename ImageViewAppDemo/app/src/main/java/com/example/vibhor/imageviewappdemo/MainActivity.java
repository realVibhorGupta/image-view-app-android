package com.example.vibhor.imageviewappdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addOnClickListener();
    }

    public void addOnClickListener()
    {

        button= (Button) findViewById(R.id.button);
        imageView= (ImageView) findViewById(R.id.imageView1);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 imageView.setImageResource(R.drawable.third);
            }
        });
    }
}
