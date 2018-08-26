package com.mcet.ponmanikandan.festmate;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView about = (TextView) findViewById(R.id.about);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this,AboutUsActivity.class);
                startActivity(i);
            }
        });
    }

    public void validate(View view){

        EditText username = (EditText) findViewById(R.id.username);

        EditText password = (EditText) findViewById(R.id.passsword);

        String Uname = username.getText().toString();
        String pass = password.getText().toString();



        if((Uname.equals("admin"))&&(pass.equals("admin"))){
            Intent i = new Intent(LoginActivity.this,Menu_Screen.class);
            Toast.makeText(LoginActivity.this,"Welcome to Festmate!",Toast.LENGTH_LONG).show();
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_right,R.anim.silde_out_left);
        }
        else{
            Snackbar.make(view,"Invalid Credentials",Snackbar.LENGTH_LONG).setAction("Action",null).show();
        }

    }
}
