package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Karnataka_tall extends AppCompatActivity {
    private Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka_tall);

        b1 = findViewById(R.id.phil);
        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openActivityphil();
        }
    });

    b2 = findViewById(R.id.west);
        b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openActivitywest();
        }
    });

    b3 = findViewById(R.id.tiptur);
        b3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openActivitytiptur();
        }
    });
}

    public void openActivityphil() {
        Intent intent = new Intent(this, Philippines.class);
        startActivity(intent);
    }

    public void openActivitywest() {
        Intent intent = new Intent(this, West.class);
        startActivity(intent);
    }

    public void openActivitytiptur() {
        Intent intent = new Intent(this, Tiptur.class);
        startActivity(intent);
    }
}
