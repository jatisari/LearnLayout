package net.agusharyanto.learnlayout;

/**
 * Created by agus on 8/17/15.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearLayoutActivity extends AppCompatActivity {

    LinearLayout ll;
    TextView[] tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ll = new LinearLayout(LinearLayoutActivity.this);
        ll.setOrientation(ll.VERTICAL);	//	Vertical
        //  ll.setOrientation(0);	//	Horizontal
        tv = new TextView[7];

        for(int i=1;i<tv.length;i++)
        {
            tv[i] = new TextView(LinearLayoutActivity.this);
            tv[i].setText("Text "+i);
            tv[i].setTextSize(25);
            tv[i].setPadding(50, 20, 0, 10);
            ll.addView(tv[i]);
        }

        setContentView(ll);
    }


}
