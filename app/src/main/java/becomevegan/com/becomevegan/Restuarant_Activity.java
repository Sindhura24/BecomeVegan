package becomevegan.com.becomevegan;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Restuarant_Activity extends AppCompatActivity {
    private static int Time_out = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restuarant_);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent homeIntent = new Intent(Restuarant_Activity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();

            }

        }, Time_out);

    }
}


