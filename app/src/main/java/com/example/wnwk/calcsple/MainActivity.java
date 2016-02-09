package com.example.wnwk.calcsple;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /*  if (BuildConfig.DEBUG) {
            Log.d(Constants.LOG, "onCreated called");
        }*/
        setContentView(R.layout.activity_main);
    }


    public void onClick (View view) {
        EditText input = (EditText) findViewById(R.id.main_input);
        String string = input.getText().toString();
        Toast.makeText(this, string,
                Toast.LENGTH_LONG).show();
    }

}
