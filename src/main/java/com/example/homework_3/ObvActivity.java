package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ObvActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    Button save;

    EditText name;
    EditText secondName;
    EditText thirdName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obv);

        textView1 = findViewById(R.id.text_view1);
        textView2 = findViewById(R.id.text_view2);
        textView3 = findViewById(R.id.text_view3);

        name = findViewById(R.id.edit_text_name);
        secondName = findViewById(R.id.edit_text_secondName);
        thirdName = findViewById(R.id.edit_text_thirdName);

        save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = name.getText().toString();
                String text2 = secondName.getText().toString();
                String text3 = thirdName.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("key1", text1);
                intent.putExtra("key2", text2);
                intent.putExtra("key3", text3);

                textView1.setText(text1);
                textView2.setText(text2);
                textView3.setText(text3);

                //setResult(RESULT_OK, intent1);
                //finish();

                //String name = textView1.getText().toString();
                //String secondName = textView2.getText().toString();
                //String thirdName = textView3.getText().toString();

                //String name = intent.getStringExtra("Name");
                //String secondName = intent.getStringExtra("SecondName");
                //String thirdName = intent.getStringExtra("ThirdName");

                Log.d("ololo", text3);
            }
        });

    }
}

