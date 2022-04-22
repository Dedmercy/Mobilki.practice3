package ru.mirea.anichkov.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final int Requst_Code = 143;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.textView3);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data != null){
            String university = data.getStringExtra("name");
            textViewResult.setText(university);
        }
    }

    public void ClickToData(View view) {
        Intent intent = new Intent(this, DataActivity.class);
        startActivityForResult(intent, Requst_Code);
    }

}