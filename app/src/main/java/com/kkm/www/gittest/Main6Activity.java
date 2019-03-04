package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    private Button b1,b2,b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        b1 = findViewById(R.id.kar);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitykd();
            }
        });

        b2 = findViewById(R.id.tamil);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitytd();
            }
        });

        b3 = findViewById(R.id.kerela);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityked();
            }
        });

    }

    public void openActivitykd() {
        Intent intent = new Intent(this, Karnataka_short.class);
        startActivity(intent);
    }

    public void openActivitytd() {
        Intent intent = new Intent(this, Tamil_Nadu_short.class);
        startActivity(intent);
    }

    public void openActivityked() {
        Intent intent = new Intent(this, Kerala_short.class);
        startActivity(intent);
    }
}
