package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

                Intent intent = new Intent();
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, name.getText().toString() + " " + secondName.getText().toString() + " " + thirdName.getText().toString());
                intent.setAction(Intent.ACTION_SEND);
                startActivity(Intent.createChooser(intent, "Share with"));

                if(intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
