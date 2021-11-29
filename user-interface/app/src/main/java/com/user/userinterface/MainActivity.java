package com.user.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtName;
    private EditText editTextName;

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnHello:
                Toast.makeText(this, "Hello button clicked", Toast.LENGTH_SHORT).show();
                txtName.setText("Hello " + editTextName.getText().toString() + " !!!");

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
//
        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Long pressed", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        editTextName = findViewById(R.id.edtTextName);
        txtName = findViewById(R.id.Hello);

    }

}