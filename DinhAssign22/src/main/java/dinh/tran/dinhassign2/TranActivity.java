package dinh.tran.dinhassign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class TranActivity extends AppCompatActivity {
    private Button button2;
    ArrayList<String> topping = new ArrayList<>();
    CheckBox pork,beef,bacon,turkey,chicken,ham;
    RadioButton chesse,thinandcrispy,thin,stuffedcrust,a,b,c,d;
    RadioGroup groupsize,grouptype;
    Bundle piz;
    String website;
    String type;
    String size;
    int i,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tran);
        grouptype = (RadioGroup)findViewById(R.id.group2);
        groupsize = (RadioGroup)findViewById(R.id.group1);
        piz = new Bundle();
        chesse = (RadioButton)findViewById(R.id.radioButton);
        thinandcrispy = (RadioButton)findViewById(R.id.radioButton3);
        thin = (RadioButton)findViewById(R.id.radioButton2);
        stuffedcrust = (RadioButton)findViewById(R.id.radioButton4);
        a = (RadioButton)findViewById(R.id.radioButton7);
        b = (RadioButton)findViewById(R.id.radioButton6);
        c = (RadioButton)findViewById(R.id.radioButton8);
        d = (RadioButton)findViewById(R.id.radioButton5);

        grouptype.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkid)
            {
                switch (checkid)
                {
                    case R.id.radioButton:
                        type = chesse.getText().toString();
                    break;
                    case R.id.radioButton3:
                        type = thinandcrispy.getText().toString();
                        break;
                    case R.id.radioButton2:
                        type = thin.getText().toString();
                        break;
                    case R.id.radioButton4:
                        type = stuffedcrust.getText().toString();
                        break;
                }

            }
        });
        groupsize.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkid)
            {
                switch (checkid)
                {
                    case R.id.radioButton7:
                        size = a.getText().toString();
                        break;
                    case R.id.radioButton6:
                        size = b.getText().toString();
                        break;
                    case R.id.radioButton8:
                        size = c.getText().toString();
                        break;
                    case R.id.radioButton5:
                        size = d.getText().toString();
                        break;
                }

            }
        });
        bacon = (CheckBox) findViewById(R.id.checkBox7);
        beef = (CheckBox) findViewById(R.id.checkBox3);
        pork = (CheckBox) findViewById(R.id.checkBox2);
        turkey = (CheckBox) findViewById(R.id.checkBox4);
        chicken = (CheckBox) findViewById(R.id.checkBox6);
        ham = (CheckBox) findViewById(R.id.checkBox8);
        bacon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    topping.add(bacon.getText().toString());
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i++;
                }
                else
                {
                    p = topping.indexOf(bacon.getText().toString());
                    topping.remove(p);
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i--;
                }
            }
        });
        pork.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    topping.add(pork.getText().toString());
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i++;
                }
                else
                {
                    p = topping.indexOf(pork.getText().toString());
                    topping.remove(p);
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i--;
                }
            }
        });
        beef.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    topping.add(beef.getText().toString());
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i++;
                }
                else
                {
                    p = topping.indexOf(beef.getText().toString());
                    topping.remove(p);
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i--;
                }
            }
        });
        ham.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    topping.add(ham.getText().toString());
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i++;
                }
                else
                {
                    p = topping.indexOf(ham.getText().toString());
                    topping.remove(p);
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i--;
                }
            }
        });
        chicken.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    topping.add(chicken.getText().toString());
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i++;
                }
                else
                {
                    p = topping.indexOf(chicken.getText().toString());
                    topping.remove(p);
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i--;
                }
            }
        });
        turkey.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    topping.add(turkey.getText().toString());
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i++;
                }
                else
                {
                    p = topping.indexOf(turkey.getText().toString());
                    topping.remove(p);
                    Toast.makeText(TranActivity.this,topping.toString(),Toast.LENGTH_SHORT).show();
                    i--;
                }
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TranActivity.this, "Choice type, size and topping", Toast.LENGTH_LONG).show();
                Intent screen3 = new Intent(TranActivity.this, HoaActivity.class);
                startActivity(screen3);

            }
        });

        Intent a = getIntent();
        ImageView pic = (ImageView) findViewById(R.id.imageView);

    String Touch = a.getStringExtra("press");



        if(Touch.equalsIgnoreCase("dominoclick"))
        {
            pic.setImageResource(R.drawable.domino);
        }
        else if (Touch.equalsIgnoreCase("hutclick"))
        {
            pic.setImageResource(R.drawable.hut);
        }
        else if (Touch.equalsIgnoreCase("papaclick"))
        {
            pic.setImageResource(R.drawable.papa);
        }
        else if (Touch.equalsIgnoreCase("godclick")) {
            pic.setImageResource(R.drawable.god);
        }

    }



}