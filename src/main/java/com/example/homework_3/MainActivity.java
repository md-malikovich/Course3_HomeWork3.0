package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button share; //notObvIntent
    Button save; // obv_intent
    EditText name;
    EditText secondName;
    EditText thirdName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        share = findViewById(R.id.share);
        save = findViewById(R.id.save);
        name = findViewById(R.id.edit_text_name);
        secondName = findViewById(R.id.edit_text_secondName);
        thirdName = findViewById(R.id.edit_text_thirdName);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ObvActivity.class);
                intent.putExtra("Name", name.getText().toString());
                intent.putExtra("SecondName", secondName.getText().toString());
                intent.putExtra("ThirdName", thirdName.getText().toString());
                startActivity(intent);
            }
        });

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
                //intent.putExtra(Intent.EXTRA_TEXT, "___");
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                    Log.d("ololo", text1);
                }
            }
        });
    }
}

/*
        save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = name.getText().toString();
                Intent intent1 = new Intent();
                intent1.putExtra("key", text1);
                setResult(RESULT_OK, intent1);
                finish();

                String text2 = secondName.getText().toString();
                Intent intent2 = new Intent();
                intent2.putExtra("key", text2);
                setResult(RESULT_OK, intent2);
                finish();

                String text3 = thirdName.getText().toString();
                Intent intent3 = new Intent();
                intent3.putExtra("key", text3);
                setResult(RESULT_OK, intent3);
                finish();

            }
        });
 */
