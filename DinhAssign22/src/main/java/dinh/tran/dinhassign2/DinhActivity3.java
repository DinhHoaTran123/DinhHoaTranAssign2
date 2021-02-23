package dinh.tran.dinhassign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DinhActivity3 extends AppCompatActivity {

    ArrayList<String> topping = new ArrayList<>();
    String size,type,Toppings="";
    TextView prsize,prtype,prtopping;
    String ptype,psize;
    Intent intent;
    Bundle piz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinh3);
        piz = new Bundle();
        prtype = (TextView)findViewById(R.id.printtype);
        prsize = (TextView)findViewById(R.id.printsize);
        prtopping = (TextView)findViewById(R.id.printtopping);
        intent = getIntent();
        piz = intent.getExtras();

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

    }
}