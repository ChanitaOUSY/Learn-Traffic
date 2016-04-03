package mahidol.tan.chanitaou.learntraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by PTC-3003X9 on 3/4/2559.
 */
public class MyAdapter extends BaseAdapter {
    //Explicit
    private Context context;
    private String[] titleStrings, descStrings;
    private int[] incoInts;

    public MyAdapter(Context context, String[] titleStrings, String[] descStrings, int[] incoInts) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.descStrings = descStrings;
        this.incoInts = incoInts;
    }

    @Override
    public int getCount() {
        return incoInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_lstview, viewGroup, false);


        //for text view
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        TextView desTextView = (TextView) view1.findViewById(R.id.textView3);
        desTextView.setText(descStrings[i]);

//For Image
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(incoInts[i]);

        return view1;
    }
}// Main class
