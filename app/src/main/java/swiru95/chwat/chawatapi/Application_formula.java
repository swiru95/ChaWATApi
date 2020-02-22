package swiru95.chwat.chawatapi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
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
        if(!(((EditText)findViewById(R.id.uri_box)).getText().toString().trim().matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+") ||
                !((EditText)findViewById(R.id.uri_box)).getText().toString().trim().matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+\\.+[a-z]") ||
                !((EditText)findViewById(R.id.uri_box)).getText().toString().trim().matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+\\.+[a-z]+\\.+[a-z]"))
        ){
            new AlertDialog.Builder(Application_formula.this)
                    .setTitle("UWAGA")
                    .setMessage("Błędnie podany adres e-mail!\nSprawdź proszę jego poprawność!")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    }).show();
            return;
        }
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "chor@wat.edu.pl", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Rekrutacja");
        emailIntent.putExtra(
                Intent.EXTRA_TEXT,
                ((EditText)findViewById(R.id.mail_box)).getText().toString()+
                "\n\nWysłano od: "+ ((EditText)findViewById(R.id.uri_box)).getText().toString()
        );
        startActivityForResult(emailIntent, 1);
    }
}
