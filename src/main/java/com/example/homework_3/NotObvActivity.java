package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NotObvActivity extends AppCompatActivity {

    EditText name;
    EditText secondName;
    EditText thirdName;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_obv);

        name = findViewById(R.id.edit_text_name);
        secondName = findViewById(R.id.edit_text_secondName);
        thirdName = findViewById(R.id.edit_text_thirdName);
        share = findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = getIntent();
                if(intent != null) {
                    String text = intent.getStringExtra(Intent.EXTRA_TEXT);
                    Log.d("iii", text);
                }
            }
        });
    }
}