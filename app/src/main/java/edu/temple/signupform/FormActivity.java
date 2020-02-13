package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
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


        TextView password = findViewById(R.id.textPassword);
        TextView confirm = findViewById(R.id.textconfirm);
        TextView email = findViewById(R.id.textEmail);
        TextView name = findViewById(R.id.textName);


        if(email.getText() == "" || password.getText() == "" || confirm.getText() ==""|| name.getText() == ""){
            Context context = getApplicationContext();
            CharSequence text = "Please enter all required Data";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else{
            if(password.getText() != confirm.getText()){
                Context context = getApplicationContext();
                CharSequence text = "Passwords Must Match";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            else{
                Context context = getApplicationContext();
                CharSequence text = "Welcome, " + name.getText() + ", to the SignUpForm App.";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }



    }
}
