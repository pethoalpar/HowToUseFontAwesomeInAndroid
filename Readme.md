<h1>How to use awesome fonts in android</h1>

<h3>Download awesome fonts and unzip</h3>

[fontawesome](http://fontawesome.io/)

<h3>Put in assests directory the fontawesome-webfont.ttf file</H3>

<h3>Set the view typeface</h3>

```java
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
```

<h3>Declare strings in the values directory</h3>

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="fa_motorcycle">&#xf21c;</string>
    <string name="fa_laptop">&#xf109;</string>
    <string name="fa_up">&#xf087;</string>
</resources>
```

<h3>Set text in the layout file</h3>

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="pethoalpar.com.howtousefontawesomeinandroid.MainActivity">

    <TextView
        android:id="@+id/textView1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="52dp"
        android:textSize="40dp"
        android:textColor="#FF0000"
        android:text="@string/fa_motorcycle" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/textView1"
        android:layout_alignStart="@+id/textView1"
        android:layout_below="@+id/textView1"
        android:layout_marginTop="64dp"
        android:textSize="40dp"
        android:text="@string/fa_laptop" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/textView2"
        android:layout_alignStart="@+id/textView2"
        android:layout_below="@+id/textView2"
        android:layout_marginTop="72dp"
        android:textSize="40dp"
        android:textColor="#424242"
        android:text="@string/fa_up" />
</RelativeLayout>
```