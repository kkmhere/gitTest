package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kerala_tall extends AppCompatActivity {
    private Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala_tall);

        b1 = findViewById(R.id.vpm);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityvpm();
            }
        });

        b2 = findViewById(R.id.kera);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitykera();
            }
        });
    }

    public void openActivityvpm() {
        Intent intent = new Intent(this, Vpm.class);
        startActivity(intent);
    }

    public void openActivitykera() {
        Intent intent = new Intent(this, Kera.class);
        startActivity(intent);
    }
}
