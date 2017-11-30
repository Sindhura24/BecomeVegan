package becomevegan.com.becomevegan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NonVeganFoodMenu extends AppCompatActivity {
    Button but13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_vegan_food_menu);
        init1();
    }
    public void init1(){

        but13=(Button)findViewById(R.id.but_chip);
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy =new Intent(NonVeganFoodMenu.this,nonvegan_chipotle.class);
                startActivity(toy);




            }
        });
    }
}
