package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Third extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button goBackBtn = findViewById(R.id.backToSecond);
        goBackBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
