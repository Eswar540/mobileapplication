package com.eswar.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("RestrictedAPI")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_options,menu);
        MenuBuilder mn=(MenuBuilder) menu;
        mn.setOptionalIconsVisible(true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, "Select Item: "+item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId())
        {
            case R.id.upload:
                Toast.makeText(this, "File Uploaded "+item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.download:
                Toast.makeText(this, "File downloaded "+item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(this, "File shared "+item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.exit:
                System.exit(0);
            case R.id.settings:
                Toast.makeText(this, "Clicked on settings "+item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
