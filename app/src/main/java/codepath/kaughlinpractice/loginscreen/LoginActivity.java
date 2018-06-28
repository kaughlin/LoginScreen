package codepath.kaughlinpractice.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logIn(View view) {



        Toast.makeText(getApplicationContext(), "Welcome to Instagram", Toast.LENGTH_LONG).show();

        Intent i = new Intent(this, homescreen.class);
        startActivity(i);
    }
}


