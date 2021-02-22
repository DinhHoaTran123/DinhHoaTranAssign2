package dinh.tran.dinhassign2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class HoaActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoa);

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
    }
}