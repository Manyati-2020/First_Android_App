package com.zubair.activityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FourthActivity extends AppCompatActivity {
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        message = getIntent().getStringExtra("KEY");
        TextView textView = findViewById(R.id.fourth_textView);
        textView.setText(message);

        final Button button = findViewById(R.id.fourth_button);
        final String text = " Fourth Message has been  Added ";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthActivity.this, MainActivity.class);
                message = message+","+ text ;
                intent.putExtra("KEY" ,message);
                startActivity(intent);
            }
        });
    }
}
