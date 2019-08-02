package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ObvActivity extends AppCompatActivity {

    Button button;
    TextView textView1;
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obv);

        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.text_view1);
        textView2 = findViewById(R.id.text_view2);
        textView3 = findViewById(R.id.text_view3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String text1 = intent.getStringExtra("Name");
                String text2 = intent.getStringExtra("SecondName");
                String text3 = intent.getStringExtra("ThirdName");
                textView1.setText(text1);
                textView2.setText(text2);
                textView3.setText(text3);
                finish();
            }
        });
    }
}

