package com.example.contextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button one, two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.button);
        two = (Button) findViewById(R.id.buttonVeg);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu pop=new PopupMenu(MainActivity.this,one);
                pop.getMenuInflater().inflate(R.menu.popvalues,pop.getMenu());
                pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        Toast.makeText(MainActivity.this, "youcclicked "+menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                         return true;
                    }
                });

                pop.show();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 PopupMenu popup=new PopupMenu(MainActivity.this,two);
                 popup.getMenuInflater().inflate(R.menu.popvalues,popup.getMenu());
                 popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                     @Override
                     public boolean onMenuItemClick(MenuItem menuItem) {

                         Toast.makeText(MainActivity.this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                           return true;

                     }
                 });
                 popup.show();

            }
        });

    }

