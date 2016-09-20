package com.example.cjkx38.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginButton;
    private EditText userName;
    private EditText userPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        loginButton =(Button)findViewById(R.id.login);
        userName=(EditText)findViewById(R.id.account);
        userPassword=(EditText)findViewById(R.id.pwd);

        userName.setText("cps");
        userPassword.setText("cps");

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String user=userName.getText().toString();
                String password=userPassword.getText().toString();

                //boolean result=HttpUtility.ValidateUser(user,password);
               // if(result){
                    //GlobalPara.UserName=user;
                    //GlobalPara.PSW=password;
                    //Intent i = new Intent();
                    //i.setClass(Login.this,AndroidDP.class);
                    //startActivity(i);
                    //Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();
                //}
                if(user=="cps" && password=="123")
                {
                    Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Incorrect User Name or Password",Toast.LENGTH_SHORT).show();
                }
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
