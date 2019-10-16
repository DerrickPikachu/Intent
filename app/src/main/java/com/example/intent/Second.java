package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button goBackBtn = findViewById(R.id.backToFirst);
        Button switchToThirdBtn = findViewById(R.id.switchToThird);
        goBackBtn.setOnClickListener(this);
        switchToThirdBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backToFirst) {
            finish();
        }
        else if (view.getId() == R.id.switchToThird) {
            startActivity(new Intent(this, Third.class));
        }
    }
}
