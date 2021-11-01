package com.pqt.phamquangthanh.forminput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,mssv,dateofbirth,sex,address,phone,email;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("") || mssv.getText().toString().equals("") || dateofbirth.getText().toString().equals("")
                 || phone.getText().toString().equals("") || email.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"bạn nhập thiếu dữ liệu",Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(MainActivity.this,"bạn nhập thành công",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void AnhXa(){
        name         = (EditText) findViewById(R.id.name);
        mssv         = (EditText) findViewById(R.id.mssv);
        dateofbirth  = (EditText) findViewById(R.id.dateofbirth);
        sex          = (EditText) findViewById(R.id.sex);
        address      = (EditText) findViewById(R.id.address);
        phone        = (EditText) findViewById(R.id.phone);
        email        = (EditText) findViewById(R.id.email);
        btnSubmit    = (Button) findViewById(R.id.button);


    }
}