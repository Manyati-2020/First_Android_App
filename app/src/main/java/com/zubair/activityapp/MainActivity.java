package com.zubair.activityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String message= getIntent().getStringExtra("KEY");
        TextView textDisplay = findViewById(R.id.firstTextView);
        textDisplay.setText(message);

        final Button button = findViewById(R.id.button);
        final EditText text = findViewById(R.id.inputText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String message = text.getText().toString();
                intent.putExtra("KEY" ,message);
                startActivity(intent);
            }
        });
    }
}
