package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TamilNadu_tall extends AppCompatActivity {
    private Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_nadu_tall);

        b1 = findViewById(R.id.chandra);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitylaksh();
            }
        });

        b2 = findViewById(R.id.east);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityeast();
            }
        });

        b3 = findViewById(R.id.aliyar);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityaliyar();
            }
        });
    }

    public void openActivitylaksh() {
        Intent intent = new Intent(this, Lakshdweep.class);
        startActivity(intent);
    }

    public void openActivityeast() {
        Intent intent = new Intent(this, East.class);
        startActivity(intent);
    }

    public void openActivityaliyar() {
        Intent intent = new Intent(this, Aliyar.class);
        startActivity(intent);
    }
}
