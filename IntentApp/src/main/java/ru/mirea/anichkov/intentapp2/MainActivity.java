package ru.mirea.anichkov.intentapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private String dateString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        dateString = sdf.format(new Date(dateInMillis));

        TextView myTextView = findViewById(R.id.textView3);
        myTextView.setText(dateString);

    }
    public void ClicktoNextActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message", dateString);
        startActivity(intent);
    }
}