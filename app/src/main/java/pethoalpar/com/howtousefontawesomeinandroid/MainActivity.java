package pethoalpar.com.howtousefontawesomeinandroid;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String FONT_NAME = "fontawesome-webfont.ttf";

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) this.findViewById(R.id.textView1);
        textView2 = (TextView) this.findViewById(R.id.textView2);
        textView3 = (TextView) this.findViewById(R.id.textView3);

        textView1.setTypeface(Typeface.createFromAsset(getAssets(), FONT_NAME));
        textView2.setTypeface(Typeface.createFromAsset(getAssets(), FONT_NAME));
        textView3.setTypeface(Typeface.createFromAsset(getAssets(), FONT_NAME));
    }
}
