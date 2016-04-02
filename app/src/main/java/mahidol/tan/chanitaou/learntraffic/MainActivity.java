package mahidol.tan.chanitaou.learntraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Explict การประกาศตัวแปร
    private ListView trafficListView;
    private Button abouttheButtom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Blind Widget คือ การผูกความสัมพันธ์ของ Variable and Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        abouttheButtom = (Button) findViewById(R.id.button);

        //การเก็บเหตุการณ์จากการคลิกปุ่ม
        abouttheButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.pig);
                mediaPlayer.start();


                //onClick
            }
        });
    }// <Main Method นี่คือเมดธอด ค่ะ

}//Main Class นี่คือคลาสหลัก คะ
