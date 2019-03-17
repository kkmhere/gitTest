package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kerala_hybrid extends AppCompatActivity {
    private Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala_hybrid);

        b1 = findViewById(R.id.ananda);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityananda();
            }
        });

        b2 = findViewById(R.id.kerag);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitykerag();
            }
        });

        b3 = findViewById(R.id.kerasr);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitykerasr();
            }
        });

        b4 = findViewById(R.id.vhc2);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityvhc2();
            }
        });
    }

    public void openActivityananda(){

        Intent intent = new Intent(this, Anandaganga.class);
        startActivity(intent);
    }

    public void openActivitykerag() {

        Intent intent = new Intent(this, Keraganga.class);
        startActivity(intent);
    }

    public void openActivitykerasr(){

        Intent intent = new Intent(this, Kerasree.class);
        startActivity(intent);
    }

    public void openActivityvhc2() {

        Intent intent = new Intent(this, Vh2.class);
        startActivity(intent);
    }
}
