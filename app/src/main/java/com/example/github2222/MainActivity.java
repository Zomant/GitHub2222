package com.example.github2222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hi all t28-11-2022a vijayee", Toast.LENGTH_SHORT).show();


        Toast.makeText(this, "production", Toast.LENGTH_SHORT).show();


        Toast.makeText(this, "testing", Toast.LENGTH_SHORT).show();


    }
}