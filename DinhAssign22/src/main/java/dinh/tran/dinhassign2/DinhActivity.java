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

public class DinhActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen2 = new Intent(DinhActivity.this,TranActivity.class);
                startActivity(screen2);
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
}