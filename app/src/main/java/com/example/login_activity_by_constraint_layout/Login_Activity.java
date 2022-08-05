package com.example.login_activity_by_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Activity extends Activity implements View.OnClickListener {

    private TextView txtView;
    private EditText edtUsername,edtPassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_by_constraint);
        initializeViews();
        initListner();
    }
    private void initializeViews(){
        txtView = findViewById(R.id.textView);
        button = findViewById(R.id.sign_in_button);
        edtUsername = findViewById(R.id.editText);
        edtPassword = findViewById(R.id.editText2);
    }
    private void initListner(){
        button.setOnClickListener(this);
        txtView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==txtView){
            txtView.setText("");
        }else {
            if (edtUsername.getText().toString().equals("aditya") && edtPassword.getText().toString().equals("aditya123")){
                txtView.setText("Welcome "+edtUsername.getText());
            }else {
                txtView.setText("Invalid User Name & Password");
            }
        }
    }
}

