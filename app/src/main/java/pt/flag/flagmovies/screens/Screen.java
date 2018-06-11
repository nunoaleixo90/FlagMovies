package pt.flag.movieapp.screens;

import android.app.Activity;
import android.os.Bundle;

import pt.flag.movieapp.utils.DLog;

public abstract class Screen extends Activity {

    protected final String tag = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DLog.d(tag, "onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        DLog.d(tag, "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        DLog.d(tag, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        DLog.d(tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        DLog.d(tag, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DLog.d(tag, "onDestroy");
    }
}
