package com.kkm.www.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView textView;
    public void tamil_details(View view)
    {
        textView.setText("TAMIL NADU DETAILS HERE");
    }

    public void kerela_details(View view)
    {
        textView.setText("KERELA DETAILS HERE");
    }

    public void karnataka_details(View view) { textView.setText("KARNATAKA DETAILS"); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView=(TextView)findViewById(R.id.cocoDetails);


    }
}
