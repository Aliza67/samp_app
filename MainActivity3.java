package co.uk.eflashstores.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String name = null;

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.first_name);
        textView.setText(message);
        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView2 = findViewById(R.id.last_name);
        textView2.setText(message1);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView3 = findViewById(R.id.enter_middle_name);
        textView3.setText(message2);
        name = message + message1 + message2;

        textView3.setText(name);

    }
}