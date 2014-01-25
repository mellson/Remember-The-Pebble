package dk.itu.rtp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class JavaActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        Log.d("Remember The Pebble", ScalaHelpers.hello());

        setContentView(R.layout.main);
    }
}
