package mahidol.tan.chanitaou.learntraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class SplashScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
startActivity(new Intent(SplashScreen.this,MainActivity.class ));
                finish();

            }
        },8000);

        MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),
                R.raw.intro_tata);
        mediaPlayer.start();

    }//Main Method


}//Main Class
