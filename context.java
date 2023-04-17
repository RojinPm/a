package com.example.contextnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     ListView First;
    String [] contacts = {"Rohith", "Rojin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        First=(ListView) findViewById(R.id.listDemo);
         ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,

                 android.R.layout.simple_list_item_1,contacts);
             First.setAdapter(adapter);
             registerForContextMenu(First);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

         MenuInflater inflater=getMenuInflater();
         inflater.inflate(R.menu.menu,menu);
         menu.setHeaderTitle("Select an action");

    }
     public boolean onContextItemSelected(MenuItem Item){

           if(Item.getItemId() == R.id.one){

               Toast.makeText(getApplicationContext(),"", Toast.LENGTH_SHORT).show();

           }else if(Item.getItemId() == R.id.two){

               Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
           }else{

               return false;
           }
           return true;
     }

}