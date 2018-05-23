package com.example.knyazuk.traenee_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button minusButton;
    private Button plusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        textView = findViewById(R.id.text);
        minusButton = findViewById(R.id.minus);
        plusButton = findViewById(R.id.plus);

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.format("%s %s", textView.getText(), " - 1"));
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.format("%s %s", textView.getText(), " + 1"));
            }
        });
    }
}
