package dinh.tran.dinhassign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class TranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tran);

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
        else if (Touch.equalsIgnoreCase("god")) {
            pic.setImageResource(R.drawable.god);
        }

    }
}