package com.divae.aburgmaier.javatokotlin;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvDisplay = findViewById(R.id.tv_display);
        final EditText etName = findViewById(R.id.et_name);
        final Button btnGreet = findViewById(R.id.btn_greet);

        btnGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etName.getText() == null || etName.getText().toString().isEmpty()) {
                    tvDisplay.setText(R.string.tv_error_text);
                    tvDisplay.setTextColor(Color.RED);
                } else {
                    String name = etName.getText().toString();
                    name = name.trim();
                    tvDisplay.setTextColor(Color.GRAY);
                    tvDisplay.setText(getString(R.string.text_greetin, name));
                    etName.getText().clear();
                }
            }
        });

    }
}
