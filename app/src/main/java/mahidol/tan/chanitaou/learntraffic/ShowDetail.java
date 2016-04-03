package mahidol.tan.chanitaou.learntraffic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import static mahidol.tan.chanitaou.learntraffic.R.id.textView5;

public class ShowDetail extends AppCompatActivity {
    //Explicit
    private TextView titleTextView, detaTextView;
    //ImageView trafImageView; เหมือนกับ
    private ImageView traImageView;

    private GoogleApiClient client2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);
        //Bind Widget
        titleTextView = (TextView) findViewById(R.id.textView4);
        detaTextView = (TextView) findViewById(R.id.textView5);
        traImageView = (ImageView) findViewById(R.id.imageView2);

        //recieve and show
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        int inImage = getIntent().getIntExtra("Icon", R.drawable.traffic_01);
        traImageView.setImageResource(inImage);
        int indext = getIntent().getIntExtra("Index", 0);
        String[] detailStrings = getResources().getStringArray(R.array.detail);
        detaTextView.setText(detailStrings[indext]);

    }//Main Method


} // Main Class
