package com.example.myyoutubeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onButtonClick (View view){
        TextView txtHello = findViewById(R.id.textMessage);
        TextView fName = findViewById(R.id.textViewFName);
        TextView lName = findViewById(R.id.textViewLName);
        TextView Email = findViewById(R.id.textViewEmail);

        EditText edtTxtFName = findViewById(R.id.edtTxtFName);
        EditText edtTxtLName = findViewById(R.id.edtTxtLName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEml);

        txtHello.setText("Registration Successful ");
        fName.setText(edtTxtFName.getText().toString());
        lName.setText(edtTxtLName.getText().toString());
        Email.setText(edtTxtEmail.getText().toString());
    }
}