package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Karnataka_hybrid extends AppCompatActivity {
    private Button a1,a2,a3,a4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka_hybrid);

        a1 = findViewById(R.id.keras);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitykeras();
            }
        });

        a2 = findViewById(R.id.chandras);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitychandras();
            }
        });

        a3 = findViewById(R.id.chandral);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitychandral();
            }
        });

        a4 = findViewById(R.id.vh1);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityvh1();
            }
        });
    }

    public void openActivitykeras() {

        Intent intent = new Intent(this,Kerasankara.class);
        startActivity(intent);
    }

    public void openActivitychandras() {

        Intent intent = new Intent(this, Chandrasankara.class);
        startActivity(intent);
    }

    public void openActivitychandral() {

        Intent intent = new Intent(this, Chandralaksha.class);
        startActivity(intent);
    }

    public  void openActivityvh1() {

        Intent intent = new Intent(this, Vh1.class);
        startActivity(intent);
    }
}
