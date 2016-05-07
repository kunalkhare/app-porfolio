package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    Button button;
    Context context = getApplicationContext();
    CharSequence text = "Hello toast!";
    int duration = Toast.LENGTH_SHORT;

    public MainActivity() {
        button = (Button) findViewById(R.id.button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickGoUbt(View view) {
    }

    public void clickCapstone(View view) {
    }

    public void clickMakeApp(View view) {
    }

    public void clickBuildIt(View view) {
    }

    public void clickStockHawk(View view) {
    }

    public void clickPmoives(View view) {
/*        Toast toast = Toast.makeText(context, text, duration);
        toast.show();*/
    }


}
