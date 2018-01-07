package com.example.administrator.ndk_crypto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input1, input2;
    private Button encrypt, decrypt;
    private TextView output1, output2;
    private Crypto crypto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        encrypt = (Button) findViewById(R.id.encrypt);
        decrypt = (Button) findViewById(R.id.decrypt);
        output1 = (TextView) findViewById(R.id.output1);
        output2 = (TextView) findViewById(R.id.output2);
        crypto = new Crypto();

        encrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = input1.getText().toString();
                String output = crypto.encrypt(input);
                output1.setText(output);
            }
        });

        decrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = input2.getText().toString();
                String output = crypto.decrypt(input);
                output2.setText(output);
            }
        });

    }
}