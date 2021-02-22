package dinh.tran.dinhassign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class TranActivity extends AppCompatActivity {
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tran);
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