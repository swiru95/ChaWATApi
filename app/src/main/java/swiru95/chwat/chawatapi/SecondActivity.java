package swiru95.chwat.chawatapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import com.example.chawatapi.R;

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
        switch(view.getId())
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
        Intent intent = new Intent(this, site_activity.class);
        intent.putExtra("URL_VAR", url);
        startActivity(intent);
    }
}
