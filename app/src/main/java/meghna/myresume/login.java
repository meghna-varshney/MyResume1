package meghna.myresume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private Button Login;
    private EditText Email;
    private EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       Email=(EditText)findViewById(R.id.etEmail);
       Password=(EditText)findViewById(R.id.etPassword);
       Login=(Button)findViewById(R.id.btnButton);
       Login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                   Toast.makeText(getApplicationContext(),"login sucessfully",Toast.LENGTH_LONG).show();
                   Intent intent = new Intent(login.this,myresume.class);
                   startActivity(intent);

           }
       });

    }
}
