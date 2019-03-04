package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {
    private Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        b1 = findViewById(R.id.kar);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitykarh();
            }
        });

        b2 = findViewById(R.id.tamil);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitytamh();
            }
        });

        b3 = findViewById(R.id.kerela);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitykerh();
            }
        });

    }

    public void openActivitykarh() {
        Intent intent = new Intent(this, Karnataka_hybrid.class);
        startActivity(intent);
    }

    public void openActivitytamh() {
        Intent intent = new Intent(this, TamilNadu_hybrid.class);
        startActivity(intent);
    }

    public void openActivitykerh() {
        Intent intent = new Intent(this, Kerala_hybrid.class);
        startActivity(intent);
    }
}
