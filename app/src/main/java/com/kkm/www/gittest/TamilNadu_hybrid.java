package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.PrintWriter;

public class TamilNadu_hybrid extends AppCompatActivity {
    private Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_nadu_hybrid);

        b1 = findViewById(R.id.keraso);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitykeraso();
            }
        });

        b2 = findViewById(R.id.laksha);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitylaksha();
            }
        });

        b3 = findViewById(R.id.vh3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAvtivityvh3();
            }
        });

    }

    public void openActivitykeraso() {

        Intent intent = new Intent(this, Kerasoubhagya.class);
        startActivity(intent);
    }

    public void openActivitylaksha() {

        Intent intent = new Intent(this, Lakshaganga.class);
        startActivity(intent);
    }

    public void openAvtivityvh3() {

        Intent intent = new Intent(this, Vh3.class);
        startActivity(intent);
    }
}
