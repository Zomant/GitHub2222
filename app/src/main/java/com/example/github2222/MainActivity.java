package com.example.github2222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hi vijay  all testing 0android1221 merged", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
    }
}