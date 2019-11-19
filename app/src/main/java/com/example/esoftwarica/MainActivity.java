package com.example.esoftwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

      EditText etname, etpassword;
     Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname= findViewById(R.id.etusername);
        etpassword=findViewById(R.id.etpassword);
        btnlogin=findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        String username = etname.getText().toString();
        String password = etpassword.getText().toString();

        if(username.equals("softwarica") && password.equals("coventry")){
            Intent intent2 = new Intent(this, Home.class);
            startActivity(intent2);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"invalid username or password",Toast.LENGTH_LONG).show();
        }
    }
}
