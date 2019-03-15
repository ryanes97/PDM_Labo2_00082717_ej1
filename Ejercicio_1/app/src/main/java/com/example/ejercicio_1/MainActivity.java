package com.example.ejercicio_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private TextView txtview1;
    private EditText txt1;
    private EditText txt2;
    private String x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txtview1 = findViewById(R.id.txtview1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=txt1.getText().toString();
                txtview1.setText(x);
            }


        });

        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                x=txt2.getText().toString();
                txtview1.setText(x);
                btn1.setText("LongClick");
                return false;
            }
        });
    }


}
