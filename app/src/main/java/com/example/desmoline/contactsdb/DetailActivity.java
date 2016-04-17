package com.example.desmoline.contactsdb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    String id, name, email, tel_num1, tel_num2;
    TextView cname, cemail, ctel_num1, ctel_num2, ctel_num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        cname  = (TextView) findViewById(R.id.name);
        cemail  = (TextView) findViewById(R.id.email);
        ctel_num1  = (TextView) findViewById(R.id.tel_num1);
        ctel_num2  = (TextView) findViewById(R.id.tel_num2);


        Intent intent = getIntent();
        id = intent.getStringExtra("id");
        name = intent.getStringExtra("name");
        email = intent.getStringExtra("email");
        tel_num1 = intent.getStringExtra("tel_num1");
        tel_num2 = intent.getStringExtra("tel_num2");

        cname.setText(name);
        cemail.setText(email);
        ctel_num1.setText(tel_num1);
        ctel_num2.setText(tel_num2);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
