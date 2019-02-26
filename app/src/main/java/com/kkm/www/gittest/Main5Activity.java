package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    private Button c1,c2,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        c1 = findViewById(R.id.kar);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitykt();
            }
        });

        c2 = findViewById(R.id.tamil);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitytt();
            }
        });

        c3 = findViewById(R.id.kerela);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityket();
            }
        });

    }

    public void openActivitykt() {
        Intent intent = new Intent(this, Karnataka_tall.class);
        startActivity(intent);
    }

    public void openActivitytt() {
        Intent intent = new Intent(this, TamilNadu_tall.class);
        startActivity(intent);
    }

    public void openActivityket() {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
}
