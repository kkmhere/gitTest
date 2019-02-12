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

    public void karnataka_detials(View view)
    {
        textView.setText("1. Long lived palm living generally to an age of about 80 to 90 years.\\n2. Palms thrive well under different soil conditions varying from littoral sands to red loams and laterites.\\n3. Palms grow well up to an altitude of 3,000 ft. above the sea level. It is fairly resistant to diseases and pests.\\n4. The tree attains a height of about 15m to 18m or more.\\n5. It begins to bear in about 8 to 10 years after planting.\\n6. The nut is medium to big in size varying in shape from spheroid to linear-oblong and with colors varying from green, yellow and orange to shades of brown.\\n7. About 6,000 nuts yield a ton of copra.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView=(TextView)findViewById(R.id.cocoDetails);


    }
}
