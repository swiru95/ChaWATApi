package swiru95.chwat.chawatapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import swiru95.chwat.chawatapi.R;

public class Application_formula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_formula);
    }

    public void sendEmail(View view){

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "chor.wat.edu.pl", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Rekrutacja");
        emailIntent.putExtra(
                Intent.EXTRA_TEXT,
                ((EditText)findViewById(R.id.mail_box)).getText().toString()+
                "\nWysłano od: "+ ((EditText)findViewById(R.id.uri_box)).getText().toString()
        );
        startActivityForResult(emailIntent, 1);
    }
}
