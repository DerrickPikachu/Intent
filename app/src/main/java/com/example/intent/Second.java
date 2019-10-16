package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button goBackBtn = findViewById(R.id.backToFirst);
        goBackBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
