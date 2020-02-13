package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View v) {


        EditText password = (EditText)findViewById(R.id.textPassword);
        EditText confirm = (EditText)findViewById(R.id.textconfirm);
        EditText email = (EditText)findViewById(R.id.textEmail);
        EditText name = (EditText) findViewById(R.id.textName);
        String passtext = password.getText().toString();
        String conftext = confirm.getText().toString();
        String emailtext = email.getText().toString();
        String nametext = name.getText().toString();

        if(emailtext.length() == 0 || passtext.length() == 0 || conftext.length() == 0 || nametext.length() == 0){
            Context context = getApplicationContext();
            CharSequence text = "Please enter all required Data";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else {
            if (passtext.equals(conftext)) {
                Context context = getApplicationContext();
                CharSequence text = "Welcome, " + nametext + ", to the SignUpForm App.";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            } else {


                Context context = getApplicationContext();
                CharSequence text = "Passwords Must Match";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }


    }
}
