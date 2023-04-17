package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button one,two,three;
    EditText val;

  RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=(Button) findViewById(R.id.buttonBrowser);
        two=(Button) findViewById(R.id.buttonCall);
        relativeLayout=  (RelativeLayout) findViewById(R.id.BackgroundChange);
        three=(Button) findViewById(R.id.buttonColor);
         val=(EditText) findViewById(R.id.EditPerson);

          one.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {


                  Intent i = new Intent(Intent.ACTION_SEND);

                  i.setType("text/plain");
                  i.putExtra(Intent.EXTRA_TEXT,"Hai Hello");
                  startActivity(i);



              }
          });

           three.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                    relativeLayout.setBackgroundResource(R.color.purple_500);

               }
           });


    }
}