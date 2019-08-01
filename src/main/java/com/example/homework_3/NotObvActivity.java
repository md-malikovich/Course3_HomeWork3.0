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
                String text1 = name.getText().toString();
                String text2 = secondName.getText().toString();
                String text3 = thirdName.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("key1", text1);
                intent.putExtra("key2", text2);
                intent.putExtra("key3", text3);
                //intent.putExtra(Intent.EXTRA_TEXT, "___");                                   // ДОЛЖЕН ОТПРАВЛЯТЬ ФИО!!!
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                    Log.d("ololo", text2);

                }
            }
        });


    }

}

/*
        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra(Intent.EXTRA_TEXT);
            Log.d("iii", name);
        }
 */