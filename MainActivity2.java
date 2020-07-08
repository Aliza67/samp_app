package co.uk.eflashstores.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText MiddleName;
    String message;
    String message1;

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MiddleName = findViewById(R.id.enter_middle_name);
        String fiName = null;

        Intent intent = getIntent();
        TextView textView = findViewById(R.id.first_name);
        textView.setText(message);
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView2 = findViewById(R.id.last_name);
        textView2.setText(message);
        message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        fiName = message + ", do you have a middle name?";
        textView.setText(fiName);
    }

    @SuppressLint("WrongViewCast")
    public void clickYes(View view) {


        EditText midden = findViewById(R.id.enter_middle_name);
        TextView cont = findViewById(R.id.c_continue);
        View c = findViewById(R.id.buttonContinue);
        View rect = findViewById(R.id.myRectangleView3);

        TextView cont2 = findViewById(R.id.c_continue2);
        View c2 = findViewById(R.id.buttonContinue2);

        midden.setVisibility(View.VISIBLE);
        cont.setVisibility(View.VISIBLE);
        c.setVisibility(View.VISIBLE);
        rect.setVisibility(View.VISIBLE);

        cont2.setVisibility(View.GONE);
        c2.setVisibility(View.GONE);


    }


    public static final String EXTRA_MESSAGE =
            "co.uk.eflashstores.sampleapp.extra.MESSAGE";

    public void clickNo(View view) {

        Log.d(LOG_TAG, "Pass on to the next stage");
        Intent intent2 = new Intent(this, MainActivity3.class);


        String message2 = MiddleName.getText().toString();
        intent2.putExtra(EXTRA_MESSAGE, message);
        intent2.putExtra(EXTRA_MESSAGE, message1);
        intent2.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent2);

    }
}