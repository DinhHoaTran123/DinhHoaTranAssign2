package dinh.tran.dinhassign2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DinhActivity3 extends AppCompatActivity {

    ArrayList<String> topping = new ArrayList<>();
    String size, type, Toppingss = "";
    TextView orsize;
    TextView ortype;
    TextView ortopping;
    String sname;
    String scardnumber;
    String sphone;
    String atype, asize;
    Intent intent;
    Bundle check;
    Button button4;
   Intent intent1;
    Bundle hum;
    TextView aname,aphone,acardnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinh3);
        hum = new Bundle();
        intent1 = getIntent();
        hum = intent1.getExtras();

        ortype = (TextView) findViewById(R.id.textView16);
        orsize = (TextView) findViewById(R.id.textView17);
        ortopping = (TextView) findViewById(R.id.textView18);
        aname=(TextView)findViewById(R.id.textView20);
        aphone=(TextView)findViewById(R.id.textView21);
        acardnumber=(TextView)findViewById(R.id.textView22);

        intent = getIntent();
        check = intent.getExtras();
        button4=findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DinhActivity3.this);
                builder.setCancelable(false);
                builder.setMessage("You confirmation number is: " + number +"Your time is: "+time);
                builder.setPositiveButton("Okay!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent backHome = new Intent(DinhActivity3.this,DinhActivity.class);
                        startActivity(backHome);
                    }
                });
                builder.setNegativeButton("Don't need anymore!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });


        try {
            if (check != null) {
                atype = check.getString("Type", "");
                sname = check.getString("nameoncard","");
                scardnumber = check.getString("cardnumber","");
                sphone = check.getString("phone","");
                asize = check.getString("Size", "");
                topping = check.getStringArrayList("Topping");
            }
            aname.setText(String.format("Name:%s",sname));
            acardnumber.setText(String.format("Number:%s",scardnumber));
            aphone.setText(String.format("Phone:%s",sphone));
            ortype.setText(String.format("Type:%s", atype));
            orsize.setText(String.format("Size:%s", asize));
            for (int i = 0; i < topping.size(); i++) {
                Toppingss += topping.get(i) + "\n";
            }
            ortopping.setText(String.format("Topping:%s", topping));

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    Date time = Calendar.getInstance().getTime();



    int number = 1900561252;




}