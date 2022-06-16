package com.example.parstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private Button btnLogin;
    private EditText etUsername;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //checks to see if there is already a user logged in
        // if user is logged in, skip log in & go to MainActivity
        if(ParseUser.getCurrentUser() != null) {
            goMainActivity();
        }

        btnLogin = findViewById(R.id.btnLogin);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i(TAG, "onClick Login Button");
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                //check credentials
                loginUser(username, password);
            }});
    }

    private void loginUser(String username, String password) {
        Log.i(TAG, "Attempt to Login user: " + username);
        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                // if info doesn't match records, send error message
                if (e != null) {
                    Log.e(TAG, "Login Issue " + e );
                    Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    return;
                }
                //else, go to main activity and send success message
                goMainActivity();
                Toast.makeText(LoginActivity.this, "Success!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void goMainActivity() {
        //navigates to mainActivity and prevents from going back to login with back button
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
