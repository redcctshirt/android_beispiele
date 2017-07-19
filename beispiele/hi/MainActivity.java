package de.datenpaul.hiandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;  /* Textausgabe importieren */

public class MainActivity extends Activity {

    private TextView ausgabe;  /* Variable für Widget Textausgabe def. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ausgabe = (TextView) findViewById(R.id.hi_ausgabe);
        ausgabe.setText(R.string.hi);

    }
}
