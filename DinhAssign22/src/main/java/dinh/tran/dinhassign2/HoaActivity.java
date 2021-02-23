package dinh.tran.dinhassign2;
//DinhHoaTran - n01354661

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class HoaActivity<spinner> extends AppCompatActivity {
    Spinner spinner;
    Intent intent;
    Bundle piz;
    private EditText nameoncard;
    private EditText cardnumber;
    private EditText expirationdate;
    private EditText cvv;
    private EditText phone;
    Button button3;
    ArrayList<String> topping = new ArrayList<>();
    String size,type,Toppings="";
    TextView prsize,prtype,prtopping;
    String ptype,psize;
    Bundle hum;
    String name,number,date,cv,phonen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoa);
        piz = new Bundle();
        prtype = (TextView)findViewById(R.id.printtype);
        prsize = (TextView)findViewById(R.id.printsize);
        prtopping = (TextView)findViewById(R.id.printtopping);
        intent = getIntent();
        piz = intent.getExtras();
        button3=findViewById(R.id.button3);
        hum = new Bundle();

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nameoncard.length() < 3)
                {
                    nameoncard.setError("Minnimum 3 character:");
                }
                else if(cardnumber.length() == 0)
                {
                    cardnumber.setError("Enter number card:");
                }
                else if(expirationdate.length() == 0)
                {
                    expirationdate.setError("Enter the date:");
                }
                else if(cvv.length()==0)
                {
                    cvv.setError("Enter CVV");
                }
                else if(phone.length() == 0)
                {
                    phone.setError("Enter your number");
                }
                else {
                    name = nameoncard.getText().toString();
                    number = cardnumber.getText().toString();
                    date = expirationdate.getText().toString();
                    cv = cvv.getText().toString();
                    phonen=phone.getText().toString();
                    hum.putString("nameoncard", name);
                    hum.putString("cardnumber",number);
                    hum.putString("phone",phonen);
                    hum.putString("Size", psize);
                    hum.putString("Type",ptype);
                    hum.putStringArrayList("Topping", topping);
                    Intent screen4 = new Intent(HoaActivity.this, DinhActivity3.class);
                    startActivity(screen4);
                }
            }
        });

        try {if(piz != null)
        {
            ptype = piz.getString("Type","");
            psize = piz.getString("Size","");
            topping = piz.getStringArrayList("Topping");
        }
            prtype.setText(String.format("Type:%s",ptype));
            prsize.setText(String.format("Size:%s",psize));
            for( int i=0; i < topping.size() ; i++)
            {
                Toppings += topping.get(i) + "\n";
            }
            prtopping.setText(String.format("Topping:%s",topping));

        }
        catch(Exception e){
            e.printStackTrace();

        }




        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayList<String> arrayProvince = new ArrayList<String>();
        arrayProvince.add("Ontario");
        arrayProvince.add("Quebec");
        arrayProvince.add("Nova Scotia");
        arrayProvince.add("New Brunswick");
        arrayProvince.add("Manitoba");
        arrayProvince.add("British Columbia");
        arrayProvince.add("Prince Edward Island");
        arrayProvince.add("Saskatchewan");
        arrayProvince.add("Alberta");
        arrayProvince.add("Newfoundland and Labrador");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,arrayProvince);

        spinner.setAdapter(arrayAdapter);

        EditText editText;

        nameoncard = findViewById(R.id.editTextTextPersonName);
        cardnumber = findViewById(R.id.editTextNumber);
        expirationdate = findViewById(R.id.editTextDate);
        cvv = findViewById(R.id.editTextNumberPassword);
        phone = findViewById(R.id.editTextPhone);
        button3 = findViewById(R.id.button3);
        nameoncard.addTextChangedListener(loginTextWatcher);
        cardnumber.addTextChangedListener(loginTextWatcher);
        expirationdate.addTextChangedListener(loginTextWatcher);
        cvv.addTextChangedListener(loginTextWatcher);
        phone.addTextChangedListener(loginTextWatcher);
    }
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String name = nameoncard.getText().toString().trim();
            String dnumber = cardnumber.getText().toString().trim();
            String date = expirationdate.getText().toString().trim();
            String cv = cvv.getText().toString().trim();
            String phonenumber = phone.getText().toString().trim();
            button3.setEnabled(!name.isEmpty()&& !dnumber.isEmpty()&&!date.isEmpty()&&!cv.isEmpty()&&!phonenumber.isEmpty());
        }
        @Override
        public void afterTextChanged(Editable s) {
        }
    };

}

