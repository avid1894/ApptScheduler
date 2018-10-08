package com.example.avid1894.simpleui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String userName = "archita";
    String passWord= "abcde";
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editTextUsername = (EditText) findViewById(R.id.editText);
        final EditText editTextPassword =(EditText) findViewById(R.id.editText2);
      /*/  editTextUsername.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                boolean handled = false;
                if (i== EditorInfo.IME_ACTION_NEXT){

                    inputUsername = textView.getText().toString();
                    Toast.makeText(MainActivity.this,"Your name is:" + inputUsername, Toast.LENGTH_SHORT).show();
                }
                return handled;
            }
        });


        final EditText editTextPassword =(EditText) findViewById(R.id.editText2);
        /*editTextPassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                
                boolean handled = false;
                if(i==EditorInfo.IME_ACTION_DONE) {*/
                    

                  // Toast.makeText(MainActivity.this, "Your password is: " + inputPassword, Toast.LENGTH_SHORT).show();
              /*  }
                
                return handled;
            }



        });*/

        Login = (Button) findViewById(R.id.button3);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateInput(editTextUsername.getText().toString(), editTextPassword.getText().toString());
            }
        });


    }//on Create

    void validateInput(String username, String password) {

        if ((username.equals(userName)) && (password.equals(passWord)))
        {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }

        else
        {

            Toast.makeText(MainActivity.this, "Your password is incorrect", Toast.LENGTH_SHORT).show();

        }

    }
}
