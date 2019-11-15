package swiru95.chwat.chawatapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import swiru95.chwat.chawatapi.Application_formula;

import swiru95.chwat.chawatapi.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void goToAnotherActivity(View view) {
        Resources res = getResources();
        String[] urls = res.getStringArray(R.array.url_sites);
        String url;
        int id = view.getId();
        if(id==R.id.toto){
            Intent intent = new Intent(this, Application_formula.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, site_activity.class);
            switch(id)
            {
                case R.id.button_strona:
                    url=urls[0];
                    break;
                case R.id.button_yt:
                    url=urls[1];
                    break;
                case R.id.button_insta:
                    url=urls[2];
                    break;
                case R.id.button_face:
                    url=urls[3];
                    break;
                default:
                throw new RuntimeException("Unknow button ID");
            }
            intent.putExtra("URL_VAR", url);
            startActivity(intent);
        }
    }
}
