package com.zubair.activityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        message = getIntent().getStringExtra("KEY");
        TextView textView = findViewById(R.id.second_textView);
        textView.setText(message);

        final Button button = findViewById(R.id.second_button);
        final String text = " Second Message Has been added ";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                message = message+","+ text ;
                intent.putExtra("KEY", message);
                startActivity(intent);
            }
        });

    }
}
