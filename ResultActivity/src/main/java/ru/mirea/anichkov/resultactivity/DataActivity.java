package ru.mirea.anichkov.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity {
    private EditText universityText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        universityText = findViewById(R.id.editTextTextUniversityName);
    }


    public void ClickSendInfoAboutUniversity(View view) {
        Intent intent = new Intent();
        String result = universityText.getText().toString();
        intent.putExtra("name", result);
        setResult(RESULT_OK, intent);
        finish();
    }
}