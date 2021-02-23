package dinh.tran.dinhassign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DinhActivity3 extends AppCompatActivity {

    ArrayList<String> topping = new ArrayList<>();
    String size,type,Toppings="";
    TextView orsize,ortype,ortopping;
    String atype,asize;
    Intent intent;
    Bundle piz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinh3);
        piz = new Bundle();
        ortype = (TextView)findViewById(R.id.textView16);
        orsize = (TextView)findViewById(R.id.textView17);
        ortopping = (TextView)findViewById(R.id.textView18);
        intent = getIntent();
        piz = intent.getExtras();

        try {if(piz != null)
        {
            atype = piz.getString("Type","");
            asize = piz.getString("Size","");
            topping = piz.getStringArrayList("Topping");
        }
            ortype.setText(String.format("Type:%s",atype));
            orsize.setText(String.format("Size:%s",asize));
            for( int i=0; i < topping.size() ; i++)
            {
                Toppings += topping.get(i) + "\n";
            }
            ortopping.setText(String.format("Topping:%s",topping));

        }
        catch(Exception e){
            e.printStackTrace();

        }

    }
}