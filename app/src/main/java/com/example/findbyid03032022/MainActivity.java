package com.example.findbyid03032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mBtnOk=findViewById(R.id.btnOk);
    TextView mTxtHello=findViewById(R.id.txtHello);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtHello.setText("Hello FindById");
            }
        });
    }
}