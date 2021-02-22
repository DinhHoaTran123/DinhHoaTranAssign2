package dinh.tran.dinhassign2;
//DinhHoaTran-n01354661

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class DinhActivity extends AppCompatActivity {
    Button button;
    ImageButton domino;
    ImageButton god;
    ImageButton hut;
    ImageButton papa;
    String Touch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        domino = (ImageButton) findViewById(R.id.imageButton4);
        god = (ImageButton) findViewById(R.id.imageButton7);
        hut = (ImageButton) findViewById(R.id.imageButton5);
        papa = (ImageButton) findViewById(R.id.imageButton6);

        domino.setOnClickListener(new Touchthis());
        god.setOnClickListener(new Touchthis());
        hut.setOnClickListener(new Touchthis());
        papa.setOnClickListener(new Touchthis());

        button = findViewById(R.id.button);

        Intent intent = new Intent(DinhActivity.this,TranActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Touch == "dominoclick")
                {
                    intent.putExtra("press",Touch);
                    startActivity(intent);
                }
                else if (Touch == "hutclick")
                {
                    intent.putExtra("press",Touch);
                    startActivity(intent);
                }
                else if (Touch == "papaclick")
                {
                    intent.putExtra("press",Touch);
                    startActivity(intent);
                }
                else if (Touch == "godclick")
                {
                    intent.putExtra("press",Touch);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(DinhActivity.this, "Please choice the restaurant", Toast.LENGTH_LONG).show();

                }

            }
        });
    }

    //    Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dominos.ca/"));
        Intent camera = new Intent();
        camera.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        switch (item.getItemId()) {
            case R.id.help:
                startActivity(browserIntent);
                return true;
            case R.id.menuname:
                startActivity(camera);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



    public class Touchthis implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.imageButton4) {
                Touch = "dominoclick";
            }
            else if (v.getId() == R.id.imageButton5) {
                Touch = "hutclick";
            }
            else if (v.getId() == R.id.imageButton6){
                Touch = "papaclick";
            }
            else if (v.getId() == R.id.imageButton7)
            {
                Touch = "godclick";
            }
            }
        }
    }
