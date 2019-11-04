package swiru95.chwat.chawatapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.chawatapi.R;

public class Application_formula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_formula);
    }

    public void sendEmail(View view){
        String message = ((EditText) findViewById(R.id.uri_box)).getText().toString();
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", message, null));
        ((EditText) findViewById(R.id.uri_box)).setText("DONE");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"chor@wat.edu.pl"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Rekrutacja");
        message=((EditText)findViewById(R.id.mail_box)).getText().toString();;
        ((EditText) findViewById(R.id.mail_box)).setText("DONE");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message text");
        startActivityForResult(emailIntent, 1);
    }
}
