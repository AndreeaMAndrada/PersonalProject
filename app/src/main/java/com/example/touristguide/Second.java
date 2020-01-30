package com.example.touristguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Second extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText name =(EditText) findViewById(R.id.entername);
        final ImageButton enter=(ImageButton) findViewById(R.id.Enterbtn);
        final TextView nameshow = (TextView)findViewById(R.id.finalname);

        enter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String Name= name.getText().toString();
              nameshow.setText(Name);
            }
        });
    }
}
