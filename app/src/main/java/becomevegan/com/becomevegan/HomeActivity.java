package becomevegan.com.becomevegan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
 public Button but12;
 public Button but13;
    public void init(){

        but12=(Button)findViewById(R.id.but1);
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy =new Intent(HomeActivity.this,CustomizeOrder.class);
                startActivity(toy);




            }
        });
    }
    public void init1(){

        but13=(Button)findViewById(R.id.but_vegan_food);
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy =new Intent(HomeActivity.this,VeganFoodMenu.class);
                startActivity(toy);




            }
        });
    }
    public void init2(){

        but13=(Button)findViewById(R.id.btn3_nonveganfood);
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy =new Intent(HomeActivity.this,NonVeganFoodMenu.class);
                startActivity(toy);




            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        init1();
        init2();
    }

}
