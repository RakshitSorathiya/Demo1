package demo.android.lifecycledemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by ln-149 on 18/1/17.
 */

public class FragmentDemo extends FragmentActivity {

    private static final String TAG = FragmentDemo.class.getName();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Toast.makeText(FragmentDemo.this, "This is Fragment Activity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Log.d(TAG, "Fragment Demo: onRestart()");
    }

    @Override
    protected void onStart () {
        super.onStart();
        Log.d(TAG, "Fragment Demo: onStart()");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.d(TAG, "Fragment Demo: onResume()");
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.d(TAG, "Fragment Demo: onPause()");
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.d(TAG, "Fragment Demo: onStop()");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d(TAG, "Fragment Demo: onDestroy()");
    }
}
