package com.example.android.imagehidenseek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button bt1;
     TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(TextView)findViewById(R.id.img);
        bt1=(Button)findViewById(R.id.display);


    }
  public void Click1(View v) {
      boolean click=((ToggleButton)v).isChecked();

       if(click) {
           txt1.setVisibility(View.VISIBLE);
       }
      else{
           txt1.setVisibility(View.INVISIBLE);

  }








       }

    }



