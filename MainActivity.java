package co.uk.eflashstores.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText FirstName;
    private EditText LastName;
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    public static final String EXTRA_MESSAGE =
            "co.uk.eflashstores.sampleapp.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstName = findViewById(R.id.enter_first_name);
        LastName = findViewById(R.id.enterlastname);
    }

    public void launchSecondActivity(View view) {

        Log.d(LOG_TAG, "Button page 1 clicked!");
        Intent intent = new Intent(this, MainActivity2.class);
        String message = FirstName.getText().toString();
        String message1 = LastName.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE, message1);
        startActivity(intent);

    }
}