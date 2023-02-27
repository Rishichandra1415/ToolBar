package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;
public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);

        // step 1....
        // in this we can set self custom toolBar..
        setSupportActionBar(toolbar);

// in this we can set back home button ...
        if(getSupportActionBar()!=null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);// it is a attribute to set the home button
            getSupportActionBar().setTitle("my ToolBar");// in this we can set the tittle acc to my self..
        }
        toolbar.setTitle("My ToolBar");
        toolbar.setSubtitle("Sub Title");

    }
// in this we can over ride  the oncreateOption Menu and then set the own menu whatever er can made ...
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        new MenuInflater(this).inflate(R.menu.mmm,menu);
        return super.onCreateOptionsMenu(menu);
    }
  // in this we can make the toast by using the OnOptionItem..........
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId= item.getItemId();// in this we can store the getItem in int value
        if(itemId==R.id.New){

            Toast.makeText(this, "its a new things", Toast.LENGTH_SHORT).show();
        }

        else if(itemId==R.id.open){

            Toast.makeText(this, "its a new open", Toast.LENGTH_SHORT).show();
        }
        else if(itemId==android.R.id.home){// in this we can set  the hom ebutton in android  home buton are auutomatic set ...

            Toast.makeText(this, "its a new home", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }
else {
            Toast.makeText(this, "save", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}